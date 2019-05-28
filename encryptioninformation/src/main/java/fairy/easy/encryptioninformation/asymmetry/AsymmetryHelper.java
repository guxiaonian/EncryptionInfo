package fairy.easy.encryptioninformation.asymmetry;

import android.text.TextUtils;
import android.util.Base64;

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
import fairy.easy.encryptioninformation.utils.StringUtil;

/**
 * 非对称加密算法主类
 *
 * @author gunaonian
 */
public class AsymmetryHelper {

    private static final String TAG = AsymmetryHelper.class.getSimpleName();


    /**
     * 对称加密返回值
     */
    public static String encryptAsymmetryToString(AsymmetryType hashType, CipherAsymmetryType symmetryType, String data, String key, boolean isPublicKey) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        return encryptAsymmetryToString(hashType, symmetryType, data.getBytes(), Base64.decode(key.getBytes(), Base64.DEFAULT), isPublicKey);
    }

    /**
     * 对称加密返回值
     */
    public static String encryptAsymmetryToString(AsymmetryType hashType, CipherAsymmetryType symmetryType, byte[] data, byte[] key, boolean isPublicKey) {
        return StringUtil.bytes2HexString(encryptAsymmetry(hashType, symmetryType, data, key, isPublicKey));
    }

    /**
     * 对称加密返回值
     */
    public static byte[] encryptAsymmetry(AsymmetryType hashType, CipherAsymmetryType symmetryType, byte[] data, byte[] key, boolean isPublicKey) {
        return asymmetricTemplate(data, key, isPublicKey, symmetryType.getCipher(), true, hashType.getTypeName());
    }

    /**
     * 对称加密返回值
     */
    public static String decryptAsymmetryToString(AsymmetryType hashType, CipherAsymmetryType symmetryType, String data, String key, boolean isPublicKey) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        return decryptAsymmetryToString(hashType, symmetryType, data.getBytes(), Base64.decode(key.getBytes(), Base64.DEFAULT), isPublicKey);
    }

    /**
     * 对称加密返回值
     */
    public static String decryptAsymmetryToString(AsymmetryType hashType, CipherAsymmetryType symmetryType, byte[] data, byte[] key, boolean isPublicKey) {
        return new String(decryptAsymmetry(hashType, symmetryType, data, key, isPublicKey));
    }

    /**
     * 对称加密返回值
     */
    public static byte[] decryptAsymmetry(AsymmetryType hashType, CipherAsymmetryType symmetryType, byte[] data, byte[] key, boolean isPublicKey) {
        return asymmetricTemplate(data, key, isPublicKey, symmetryType.getCipher(), false, hashType.getTypeName());
    }


    /**
     * 非对称加密
     *
     * @param data
     * @param key
     * @param isPublicKey
     * @param transformation
     * @param isEncrypt
     * @return
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
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
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
