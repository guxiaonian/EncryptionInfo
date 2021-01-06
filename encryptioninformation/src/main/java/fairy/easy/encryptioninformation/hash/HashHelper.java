package fairy.easy.encryptioninformation.hash;

import android.text.TextUtils;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import fairy.easy.encryptioninformation.utils.StringUtil;

/**
 * hash算法主类
 *
 * @author gunaonian
 */
public class HashHelper {

    private static final String TAG = HashHelper.class.getSimpleName();

    /**
     * Hash加密返回值
     *
     * @param hashType hash类型
     * @param data     The data.
     * @return the hex string of Hash encryption
     */
    public static String encryptHashToString(HashType hashType, String data) {
        if (TextUtils.isEmpty(data)) {
            return null;
        }
        return encryptHashToString(hashType, data.getBytes());
    }

    /**
     * Hash加密返回值
     *
     * @param hashType hash类型
     * @param data     The data.
     * @return the hex string of Hash encryption
     */
    public static String encryptHashToString(HashType hashType, byte[] data) {
        return StringUtil.bytes2HexString(encryptHash(hashType, data));
    }

    /**
     * Hash加密返回值
     *
     * @param hashType hash类型
     * @param data     The data.
     * @return the hex string of Hash encryption
     */
    public static byte[] encryptHash(HashType hashType, byte[] data) {
        return shaTemplate(hashType, data);
    }

    /**
     * 具体的方法计算
     *
     * @param hashType hash加密类型
     * @param data     byte加密数据
     * @return byte加密后的数据
     */
    private static byte[] shaTemplate(HashType hashType, byte[] data) {
        if (data == null || data.length <= 0) {
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance(hashType.getTypeName());
            byte[] bytes = md.digest(data);
            StringBuilder result = new StringBuilder();
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                result.append(temp);
            }
            return result.toString().getBytes();

        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG, e.toString());
            return null;
        }
    }

}
