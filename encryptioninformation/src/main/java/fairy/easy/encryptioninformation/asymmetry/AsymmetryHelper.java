package fairy.easy.encryptioninformation.asymmetry;

import android.text.TextUtils;
import android.util.Log;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import fairy.easy.encryptioninformation.cipher.CipherAsymmetryType;
import fairy.easy.encryptioninformation.code.Base64Helper;
import fairy.easy.encryptioninformation.utils.StringUtil;

/**
 * 非对称加密算法主类
 *
 * @author gunaonian
 */
public class AsymmetryHelper {

    private static final String TAG = AsymmetryHelper.class.getSimpleName();


    /**
     * 非对称加密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字符串
     * @param key          加密密码 字符串
     * @param isPublicKey  是否是公钥
     * @return 16进制字符串
     */
    public static String encryptAsymmetryToHexString(AsymmetryType hashType, CipherAsymmetryType symmetryType, String data, String key, boolean isPublicKey) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        return encryptAsymmetryToHexString(hashType, symmetryType, data.getBytes(), Base64Helper.decode(key), isPublicKey);
    }

    /**
     * 非对称加密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字节数组
     * @param key          加密密码 字节数组
     * @param isPublicKey  是否是公钥
     * @return 16进制字符串
     */
    public static String encryptAsymmetryToHexString(AsymmetryType hashType, CipherAsymmetryType symmetryType, byte[] data, byte[] key, boolean isPublicKey) {
        return StringUtil.bytes2HexString(encryptAsymmetry(hashType, symmetryType, data, key, isPublicKey));
    }

    /**
     * 非对称加密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字符串
     * @param key          加密密码 字符串
     * @param isPublicKey  是否是公钥
     * @return base64数据
     */
    public static byte[] encryptAsymmetryToBase64(AsymmetryType hashType, CipherAsymmetryType symmetryType, String data, String key, boolean isPublicKey) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        return encryptAsymmetryToBase64(hashType, symmetryType, data.getBytes(), Base64Helper.decode(key), isPublicKey);
    }

    /**
     * 非对称加密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字符串
     * @param key          加密密码 字符串
     * @param isPublicKey  是否是公钥
     * @return base64数据
     */
    public static String encryptAsymmetryToBase64ToString(AsymmetryType hashType, CipherAsymmetryType symmetryType, String data, String key, boolean isPublicKey) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        byte[] result = encryptAsymmetryToBase64(hashType, symmetryType, data.getBytes(), Base64Helper.decode(key), isPublicKey);
        if (result != null) {
            return new String(result);
        }
        return null;
    }

    /**
     * 非对称加密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字节数组
     * @param key          加密密码 字节数组
     * @param isPublicKey  是否是公钥
     * @return base64数据
     */
    public static byte[] encryptAsymmetryToBase64(AsymmetryType hashType, CipherAsymmetryType symmetryType, byte[] data, byte[] key, boolean isPublicKey) {
        return Base64Helper.encode(encryptAsymmetry(hashType, symmetryType, data, key, isPublicKey));
    }


    /**
     * 非对称加密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字节数组
     * @param key          加密密码 字节数组
     * @param isPublicKey  是否是公钥
     * @return 字节数组
     */
    public static byte[] encryptAsymmetry(AsymmetryType hashType, CipherAsymmetryType symmetryType, byte[] data, byte[] key, boolean isPublicKey) {
        return asymmetricTemplate(data, key, isPublicKey, symmetryType.getCipher(), true, hashType.getTypeName());
    }

    /**
     * 非对称解密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字符串
     * @param key          加密密码 字符串
     * @param isPublicKey  是否是公钥
     * @return 16进制字符串
     */
    public static String decryptHexStringAsymmetryToString(AsymmetryType hashType, CipherAsymmetryType symmetryType, String data, String key, boolean isPublicKey) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        byte[] result = decryptHexStringAsymmetry(hashType, symmetryType, data, key, isPublicKey);
        if (result == null) {
            return null;
        }
        return new String(result);
    }

    /**
     * 非对称解密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字节数组
     * @param key          加密密码 字节数组
     * @param isPublicKey  是否是公钥
     * @return 字节数组
     */
    public static byte[] decryptHexStringAsymmetry(AsymmetryType hashType, CipherAsymmetryType symmetryType, String data, String key, boolean isPublicKey) {
        return decryptAsymmetry(hashType, symmetryType, StringUtil.hexString2Bytes(data), Base64Helper.decode(key), isPublicKey);
    }

    /**
     * 非对称解密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字符串
     * @param key          加密密码 字符串
     * @param isPublicKey  是否是公钥
     * @return 字节数组
     */
    public static byte[] decryptBase64Asymmetry(AsymmetryType hashType, CipherAsymmetryType symmetryType, String data, String key, boolean isPublicKey) {
        return decryptAsymmetry(hashType, symmetryType, Base64Helper.decode(data.getBytes()), Base64Helper.decode(key), isPublicKey);
    }

    /**
     * 非对称解密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字符串
     * @param key          加密密码 字符串
     * @param isPublicKey  是否是公钥
     * @return 字节数组
     */
    public static String decryptBase64AsymmetryToString(AsymmetryType hashType, CipherAsymmetryType symmetryType, String data, String key, boolean isPublicKey) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        byte[] result = decryptBase64Asymmetry(hashType, symmetryType, data, key, isPublicKey);
        if (result != null) {
            return new String(result);

        }
        return null;
    }


    /**
     * 非对称加密
     *
     * @param hashType     加密类型
     * @param symmetryType 填充方式
     * @param data         加密数据 字节数组
     * @param key          加密密码 字节数组
     * @param isPublicKey  是否是公钥
     * @return 字节数组
     */
    public static byte[] decryptAsymmetry(AsymmetryType hashType, CipherAsymmetryType symmetryType, byte[] data, byte[] key, boolean isPublicKey) {
        return asymmetricTemplate(data, key, isPublicKey, symmetryType.getCipher(), false, hashType.getTypeName());
    }


    /**
     * 非对称加密
     *
     * @param data           加密数据 字节数组
     * @param key            加密密码 字节数组
     * @param isPublicKey    是否是公钥
     * @param transformation 填充方式
     * @param isEncrypt      是否是加密
     * @param hashType       加密类型
     * @return 字节数组
     */
    private static byte[] asymmetricTemplate(byte[] data,
                                             byte[] key,
                                             boolean isPublicKey,
                                             String transformation,
                                             boolean isEncrypt,
                                             String hashType) {
        if (data == null || data.length == 0 || key == null || key.length == 0) {
            return null;
        }
        try {
            Key rsaKey;
            if (isPublicKey) {
                X509EncodedKeySpec keySpec = new X509EncodedKeySpec(key);
                rsaKey = KeyFactory.getInstance(hashType).generatePublic(keySpec);
            } else {
                PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(key);
                rsaKey = KeyFactory.getInstance(hashType).generatePrivate(keySpec);
            }
            if (rsaKey == null) {
                return null;
            }
            Cipher cipher = Cipher.getInstance(transformation);
            cipher.init(isEncrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, rsaKey);
            int len = data.length;
            int maxLen = isEncrypt ? 117 : 128;
            int count = len / maxLen;
            if (count > 0) {
                byte[] ret = new byte[0];
                byte[] buff = new byte[maxLen];
                int index = 0;
                for (int i = 0; i < count; i++) {
                    System.arraycopy(data, index, buff, 0, maxLen);
                    ret = joins(ret, cipher.doFinal(buff));
                    index += maxLen;
                }
                if (index != len) {
                    int restLen = len - index;
                    buff = new byte[restLen];
                    System.arraycopy(data, index, buff, 0, restLen);
                    ret = joins(ret, cipher.doFinal(buff));
                }
                return ret;
            } else {
                return cipher.doFinal(data);
            }
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG, e.toString());
        } catch (NoSuchPaddingException e) {
            Log.e(TAG, e.toString());
        } catch (InvalidKeyException e) {
            Log.e(TAG, e.toString());
        } catch (BadPaddingException e) {
            Log.e(TAG, e.toString());
        } catch (IllegalBlockSizeException e) {
            Log.e(TAG, e.toString());
        } catch (InvalidKeySpecException e) {
            Log.e(TAG, e.toString());
        }
        return null;
    }

    private static byte[] joins(final byte[] prefix, final byte[] suffix) {
        byte[] ret = new byte[prefix.length + suffix.length];
        System.arraycopy(prefix, 0, ret, 0, prefix.length);
        System.arraycopy(suffix, 0, ret, prefix.length, suffix.length);
        return ret;
    }


}
