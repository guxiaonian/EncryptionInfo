package fairy.easy.encryptioninformation.hmac;

import android.text.TextUtils;
import android.util.Log;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import fairy.easy.encryptioninformation.utils.StringUtil;

/**
 * hmac算法主类
 *
 * @author gunaonian
 */
public class HmacHelper {

    private static final String TAG = HmacHelper.class.getSimpleName();

    /**
     * Hmac加密返回值
     *
     * @param hashType hash类型
     * @param data     The data.
     * @param key      加密密码
     * @return the hex string of Hmac encryption
     */
    public static String encryptHmacToString(HmacType hashType, String data, String key) {
        if (TextUtils.isEmpty(data) || TextUtils.isEmpty(key)) {
            return null;
        }
        return encryptHmacToString(hashType, data.getBytes(), key.getBytes());
    }

    /**
     * Hmac加密返回值
     *
     * @param hashType hash类型
     * @param data     The data.
     * @param key      byte加密密码
     * @return the hex string of Hmac encryption
     */
    public static String encryptHmacToString(HmacType hashType, byte[] data, byte[] key) {
        return StringUtil.bytes2HexString(encryptHmac(hashType, data, key));
    }

    /**
     * Hmac加密返回值
     *
     * @param hashType hash类型
     * @param data     The data.
     * @param key      byte加密密码
     * @return the hex string of Hmac encryption
     */
    public static byte[] encryptHmac(HmacType hashType, byte[] data, byte[] key) {
        return hmacTemplate(hashType, data, key);
    }

    /**
     * 具体的方法计算
     *
     * @param hashType hash加密类型
     * @param data     byte加密数据
     * @param key      byte加密密码
     * @return byte加密后的数据
     */
    private static byte[] hmacTemplate(HmacType hashType, byte[] data, byte[] key) {
        if (data == null || data.length == 0 || key == null || key.length == 0) {
            return null;
        }
        try {
            SecretKeySpec secretKey = new SecretKeySpec(key, hashType.getTypeName());
            Mac mac = Mac.getInstance(hashType.getTypeName());
            mac.init(secretKey);
            return mac.doFinal(data);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            Log.e(TAG, e.toString());
            return null;
        }
    }

}
