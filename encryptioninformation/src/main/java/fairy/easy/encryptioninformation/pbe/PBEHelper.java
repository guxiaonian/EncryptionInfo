package fairy.easy.encryptioninformation.pbe;

import android.text.TextUtils;


import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import fairy.easy.encryptioninformation.utils.LogUtils;
import fairy.easy.encryptioninformation.utils.StringUtil;

/**
 * PBE加密算法主类
 *
 * @author gunaonian
 */
public class PBEHelper {
    private static final String TAG = PBEHelper.class.getSimpleName();


    /**
     * PBE加密返回值
     *
     * @param hashType 加密类型
     * @param data     加密数据 字符串
     * @param key      密码 字符串
     * @param salt     盐 字符串
     * @param size     循环次数
     * @return 16进制字符串
     */
    public static String encryptPBE2HexString(PBEType hashType, String data, String key, String salt, int size) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key) || TextUtils.isEmpty(salt)) {
            return null;
        }
        return encryptPBE2HexString(hashType, data.getBytes(), key.getBytes(), salt.getBytes(), size);
    }

    /**
     * PBE加密返回值
     *
     * @param hashType 加密类型
     * @param data     加密数据 字节数组
     * @param key      密码
     * @param salt     盐
     * @param size     循环次数
     * @return 16进制字符串
     */
    public static String encryptPBE2HexString(PBEType hashType, byte[] data, byte[] key, byte[] salt, int size) {
        return StringUtil.bytes2HexString(encryptPBE(hashType, data, key, salt, size));
    }

    /**
     * PBE加密返回值
     *
     * @param hashType 加密类型
     * @param data     加密数据 字节数组
     * @param key      密码
     * @param salt     盐
     * @param size     循环次数
     * @return 字节数组
     */
    public static byte[] encryptPBE(PBEType hashType, byte[] data, byte[] key, byte[] salt, int size) {
        return pbeTemplate(data, key, salt, hashType.getTypeName(), true, size);
    }

    /**
     * PBE加密返回值
     *
     * @param hashType 加密类型
     * @param data     加密数据 字节数组
     * @param key      密码
     * @param salt     盐
     * @param size     循环次数
     * @return 字节数组
     */
    public static byte[] encryptPBE(PBEType hashType, String data, String key, String salt, int size) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key) || TextUtils.isEmpty(salt)) {
            return null;
        }
        return pbeTemplate(data.getBytes(), key.getBytes(), salt.getBytes(), hashType.getTypeName(), true, size);
    }


    /**
     * PBE解密返回值
     *
     * @param hashType 解密类型
     * @param data     解密数据 字符串
     * @param key      密码
     * @param salt     盐
     * @param size     循环次数
     * @return 16进制字符串
     */
    public static String decryptHexStringPBE2String(PBEType hashType, String data, String key, String salt, int size) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key) || TextUtils.isEmpty(salt)) {
            return null;
        }
        return decryptPBE2String(hashType, StringUtil.hexString2Bytes(data), key.getBytes(), salt.getBytes(), size);
    }

    /**
     * PBE解密返回值
     *
     * @param hashType 解密类型
     * @param data     解密数据 字节数组
     * @param key      密码
     * @param salt     盐
     * @param size     循环次数
     * @return 16进制字符串
     */
    public static String decryptPBE2String(PBEType hashType, byte[] data, byte[] key, byte[] salt, int size) {
        byte[] result = decryptPBE(hashType, data, key, salt, size);
        if (result != null) {
            return new String(result);
        }
        return null;
    }

    /**
     * PBE解密返回值
     *
     * @param hashType 解密类型
     * @param data     解密数据 字节数组
     * @param key      密码
     * @param salt     盐
     * @param size     循环次数
     * @return 字节数组
     */
    public static byte[] decryptPBE(PBEType hashType, byte[] data, byte[] key, byte[] salt, int size) {
        return pbeTemplate(data, key, salt, hashType.getTypeName(), false, size);
    }

    /**
     * PBE解密返回值
     *
     * @param hashType 解密类型
     * @param data     解密数据
     * @param key      密码
     * @param salt     盐
     * @param size     循环次数
     * @return 字节数组
     */
    public static byte[] decryptHexStringPBE(PBEType hashType, String data, String key, String salt, int size) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key) || TextUtils.isEmpty(salt)) {
            return null;
        }
        return pbeTemplate(StringUtil.hexString2Bytes(data), key.getBytes(), salt.getBytes(), hashType.getTypeName(), false, size);
    }


    /**
     * 具体的方法计算
     *
     * @param data      数据 字节数组
     * @param key       密码
     * @param salt      盐
     * @param algorithm 解密类型
     * @param isEncrypt 是否是加密
     * @param size      循环次数
     * @return 字节数组
     */
    private static byte[] pbeTemplate(final byte[] data,
                                      final byte[] key, final byte[] salt,
                                      final String algorithm,
                                      final boolean isEncrypt, int size) {
        if (data == null || data.length == 0 || key == null || key.length == 0) {
            return null;
        }
        try {
            PBEKeySpec pbeKeySpec = new PBEKeySpec(new String(key).toCharArray());
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(algorithm);
            Cipher cipher = Cipher.getInstance(algorithm);
            PBEParameterSpec params = new PBEParameterSpec(salt, size);
            SecretKey secretKey = secretKeyFactory.generateSecret(pbeKeySpec);
            cipher.init(isEncrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, secretKey, params);
            return cipher.doFinal(data);
        } catch (Exception e) {
            LogUtils.e(TAG, e.toString());
            return null;
        }
    }

}
