package fairy.easy.encryptioninformation.symmetry;

import android.text.TextUtils;
import android.util.Log;

import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import fairy.easy.encryptioninformation.cipher.CipherSymmetryType;
import fairy.easy.encryptioninformation.utils.StringUtil;

/**
 * 对称加密算法主类
 *
 * @author gunaonian
 */
public class SymmetryHelper {
    private static final String TAG = SymmetryHelper.class.getSimpleName();
    private static final String DES = "DES";
    private static final byte[] DEFAULT_IV = "0000000000000000".getBytes();

    /**
     * 对称加密返回值
     */
    public static String encryptSymmetryToStringDefault(SymmetryType hashType, CipherSymmetryType symmetryType, String data, String key) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        return encryptSymmetryToString(hashType, symmetryType, data.getBytes(), key.getBytes(), DEFAULT_IV);
    }

    /**
     * 对称加密返回值
     */
    public static String encryptSymmetryToString(SymmetryType hashType, CipherSymmetryType symmetryType, String data, String key, byte[] iv) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        return encryptSymmetryToString(hashType, symmetryType, data.getBytes(), key.getBytes(), iv);
    }

    /**
     * 对称加密返回值
     */
    public static String encryptSymmetryToString(SymmetryType hashType, CipherSymmetryType symmetryType, byte[] data, byte[] key, byte[] iv) {
        return StringUtil.bytes2HexString(encryptSymmetry(hashType, symmetryType, data, key, iv));
    }

    /**
     * 对称加密返回值
     */
    public static byte[] encryptSymmetry(SymmetryType hashType, CipherSymmetryType symmetryType, byte[] data, byte[] key, byte[] iv) {
        return symmetricTemplate(data, key, hashType.getTypeName(), symmetryType.getCipher(), iv, true);
    }

    /**
     * 对称加密返回值
     */
    public static String decryptSymmetryToStringDefault(SymmetryType hashType, CipherSymmetryType symmetryType, String data, String key) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        return decryptSymmetryToString(hashType, symmetryType, StringUtil.hexString2Bytes(data), key.getBytes(), DEFAULT_IV);
    }

    /**
     * 对称加密返回值
     */
    public static String decryptSymmetryToString(SymmetryType hashType, CipherSymmetryType symmetryType, String data, String key, byte[] iv) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        return decryptSymmetryToString(hashType, symmetryType, data.getBytes(), key.getBytes(), iv);
    }

    /**
     * 对称加密返回值
     */
    public static String decryptSymmetryToString(SymmetryType hashType, CipherSymmetryType symmetryType, byte[] data, byte[] key, byte[] iv) {
        return new String(decryptSymmetry(hashType, symmetryType, data, key, iv));
    }

    /**
     * 对称加密返回值
     */
    public static byte[] decryptSymmetry(SymmetryType hashType, CipherSymmetryType symmetryType, byte[] data, byte[] key, byte[] iv) {
        return symmetricTemplate(data, key, hashType.getTypeName(), symmetryType.getCipher(), iv, false);
    }

    /**
     * 具体的方法计算
     *
     * @param data byte加密数据
     * @return byte加密后的数据
     */
    private static byte[] symmetricTemplate(final byte[] data,
                                            final byte[] key,
                                            final String algorithm,
                                            final String transformation,
                                            final byte[] iv,
                                            final boolean isEncrypt) {
        if (data == null || data.length == 0 || key == null || key.length == 0) {
            return null;
        }
        try {
            SecretKey secretKey;
            if (DES.equals(algorithm)) {
                DESKeySpec desKey = new DESKeySpec(key);
                SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(algorithm);
                secretKey = keyFactory.generateSecret(desKey);
            } else {
                secretKey = new SecretKeySpec(key, algorithm);
            }
            Cipher cipher = Cipher.getInstance(transformation);
            if (iv == null || iv.length == 0) {
                cipher.init(isEncrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, secretKey);
            } else {
                AlgorithmParameterSpec params = new IvParameterSpec(iv);
                cipher.init(isEncrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, secretKey, params);
            }
            return cipher.doFinal(data);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return null;
        }
    }

}
