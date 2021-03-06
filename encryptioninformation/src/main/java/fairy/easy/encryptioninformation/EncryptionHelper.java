package fairy.easy.encryptioninformation;


import fairy.easy.encryptioninformation.asymmetry.AsymmetryHelper;
import fairy.easy.encryptioninformation.asymmetry.AsymmetryType;
import fairy.easy.encryptioninformation.cipher.CipherAsymmetryType;
import fairy.easy.encryptioninformation.cipher.CipherSymmetryType;
import fairy.easy.encryptioninformation.hash.HashHelper;
import fairy.easy.encryptioninformation.hmac.HmacHelper;
import fairy.easy.encryptioninformation.hmac.HmacType;
import fairy.easy.encryptioninformation.hash.HashType;
import fairy.easy.encryptioninformation.pbe.PBEHelper;
import fairy.easy.encryptioninformation.pbe.PBEType;
import fairy.easy.encryptioninformation.symmetry.SymmetryHelper;
import fairy.easy.encryptioninformation.symmetry.SymmetryType;

/**
 * 罗列几种加密方法
 *
 * @author gunaonian
 */
public class EncryptionHelper {

    private static final String VERSION = "0.1.1";

    public static String getVersion() {
        return VERSION;
    }

    /**
     * MD5 加密
     *
     * @param data 加密数据
     * @return 加密结果
     */
    public static String getMd5Param(String data) {
        return HashHelper.encryptHashToString(HashType.MD5, data);
    }

    /**
     * SHA256 加密
     *
     * @param data 加密数据
     * @return 加密结果
     */
    public static String getSha256Param(String data) {
        return HashHelper.encryptHashToString(HashType.SHA_256, data);
    }

    /**
     * HmacMd5 加密
     *
     * @param data 加密数据
     * @param key  密码
     * @return 加密结果
     */
    public static String getHmacMd5Param(String data, String key) {
        return HmacHelper.encryptHmacToString(HmacType.HMAC_MD5, data, key);
    }

    /**
     * HmacSHA56 加密
     *
     * @param data 加密数据
     * @param key  密码
     * @return 加密结果
     */
    public static String getHmacSha256Param(String data, String key) {
        return HmacHelper.encryptHmacToString(HmacType.HMAC_SHA256, data, key);
    }

    /**
     * AES 加密 默认向量加密
     *
     * @param data 加密数据
     * @param key  密码
     * @return 加密结果
     */
    public static String encryptAesParam(String data, String key) {
        return SymmetryHelper.encryptSymmetryToStringDefault(SymmetryType.AES, CipherSymmetryType.AES_CBC_PKCS5_PADDING, data, key);
    }

    /**
     * AES 加密 字节数组获取，未进行加工
     *
     * @param data 加密数据
     * @param key  密码
     * @return 加密结果
     */
    public static byte[] encryptAesParam(byte[] data, byte[] key) {
        return SymmetryHelper.encryptSymmetry(SymmetryType.AES, CipherSymmetryType.AES_CBC_PKCS5_PADDING, data, key, SymmetryHelper.DEFAULT_IV);
    }

    /**
     * AES 解密 默认向量解密
     *
     * @param data 解密数据
     * @param key  密码
     * @return 解密结果
     */
    public static String decryptAesParam(String data, String key) {
        return SymmetryHelper.decryptSymmetryToStringDefault(SymmetryType.AES, CipherSymmetryType.AES_CBC_PKCS5_PADDING, data, key);
    }

    /**
     * AES 解密 字节数组获取，未进行加工
     *
     * @param data 解密数据
     * @param key  密码
     * @return 解密结果
     */
    public static byte[] decryptAesParam(byte[] data, byte[] key) {
        return SymmetryHelper.decryptSymmetry(SymmetryType.AES, CipherSymmetryType.AES_CBC_PKCS5_PADDING, data, key, SymmetryHelper.DEFAULT_IV);
    }


    /**
     * RSA 加密 字节数组获取，未进行加工
     *
     * @param data 加密数据
     * @param key  密码
     * @return 加密结果
     */
    public static byte[] encryptRsaParamBytes(byte[] data, byte[] key) {
        return AsymmetryHelper.encryptAsymmetry(AsymmetryType.RSA, CipherAsymmetryType.RSA_ECB_PKCS1_PADDING, data, key, true);
    }


    /**
     * RSA 解密 字节数组获取，未进行加工
     *
     * @param data 解密数据
     * @param key  密码
     * @return 解密结果
     */
    public static byte[] decryptRsaParamBytes(byte[] data, byte[] key) {
        return AsymmetryHelper.decryptAsymmetry(AsymmetryType.RSA, CipherAsymmetryType.RSA_ECB_PKCS1_PADDING, data, key, false);
    }

    /**
     * RSA 加密 加密数据并进行hexString
     *
     * @param data 加密数据
     * @param key  密码
     * @return 加密结果
     */
    public static String encryptRsaParamWithPublicKeyToHexString(String data, String key) {
        return AsymmetryHelper.encryptAsymmetryToHexString(AsymmetryType.RSA, CipherAsymmetryType.RSA_ECB_PKCS1_PADDING, data, key, true);
    }

    /**
     * RSA 解密 解密hexString的数据
     *
     * @param data 解密数据
     * @param key  密码
     * @return 解密结果
     */
    public static String decryptHexStringRsaParamWithPrivateKey(String data, String key) {
        return AsymmetryHelper.decryptHexStringAsymmetryToString(AsymmetryType.RSA, CipherAsymmetryType.RSA_ECB_PKCS1_PADDING, data, key, false);
    }

    /**
     * RSA 加密 加密数据并进行Base64
     *
     * @param data 加密数据
     * @param key  密码
     * @return 加密结果
     */
    public static String encryptRsaParamWithPublicKey2ToBase64ToString(String data, String key) {
        return AsymmetryHelper.encryptAsymmetryToBase64ToString(AsymmetryType.RSA, CipherAsymmetryType.RSA_ECB_PKCS1_PADDING, data, key, true);
    }

    /**
     * RSA 解密 解密Base64的数据
     *
     * @param data 解密数据
     * @param key  密码
     * @return 解密结果
     */
    public static String decryptBase64RsaParamWithPrivateKey2(String data, String key) {
        return AsymmetryHelper.decryptBase64AsymmetryToString(AsymmetryType.RSA, CipherAsymmetryType.RSA_ECB_PKCS1_PADDING, data, key, false);
    }


    /**
     * PBE加密返回值
     *
     * @param data 加密数据
     * @param key  密码
     * @param salt 盐
     * @param size 循环次数
     * @return 16进制字符串
     */
    public static String encryptPBE2HexString(String data, String key, String salt, int size) {
        return PBEHelper.encryptPBE2HexString(PBEType.PBE_WITH_MD5_AND_DES, data, key, salt, size);
    }

    /**
     * PBE解密返回值
     *
     * @param data 加密数据
     * @param key  密码
     * @param salt 盐
     * @param size 循环次数
     * @return 16进制字符串
     */
    public static String decryptHexStringPBE2String(String data, String key, String salt, int size) {
        return PBEHelper.decryptHexStringPBE2String(PBEType.PBE_WITH_MD5_AND_DES, data, key, salt, size);
    }
}