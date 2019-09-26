package fairy.easy.encryptioninformation.code;

import android.text.TextUtils;
import android.util.Base64;

/**
 * @author gunaonian
 */
public class Base64Helper {

    /**
     * 解码
     *
     * @param key 数据
     * @return 字符串
     */
    public static String decode2String(String key) {
        if (TextUtils.isEmpty(key)) {
            return null;
        }
        return decode2String(key.getBytes());
    }

    /**
     * 解码
     *
     * @param key 数据
     * @return 字符串
     */
    public static String decode2String(byte[] key) {
        byte[] result = decode(key);
        if (result == null) {
            return null;
        }
        return new String(result);
    }

    /**
     * 解码
     *
     * @param key 数据
     * @return 字节数组
     */
    public static byte[] decode(String key) {
        if (TextUtils.isEmpty(key)) {
            return null;
        }
        return decode(key.getBytes());
    }

    /**
     * 解码
     *
     * @param key 数据
     * @return 字节数组
     */
    public static byte[] decode(byte[] key) {
        if (key==null) {
            return null;
        }
        return Base64.decode(key, Base64.DEFAULT);
    }

    /**
     * 编码
     *
     * @param key 数据
     * @return 字符串
     */
    public static String encode2String(String key) {
        if (TextUtils.isEmpty(key)) {
            return null;
        }
        return encode2String(key.getBytes());
    }

    /**
     * 编码
     *
     * @param key 数据
     * @return 字符串
     */
    public static String encode2String(byte[] key) {
        byte[] result = encode(key);
        if (result == null) {
            return null;
        }
        return new String(result);
    }

    /**
     * 编码
     *
     * @param key 数据
     * @return 字节数组
     */
    public static byte[] encode(String key) {
        if (TextUtils.isEmpty(key)) {
            return null;
        }
        return encode(key.getBytes());
    }

    /**
     * 编码
     *
     * @param key 数据
     * @return 字节数组
     */
    public static byte[] encode(byte[] key) {
        if (key==null) {
            return null;
        }
        return Base64.encode(key, Base64.DEFAULT);
    }
}
