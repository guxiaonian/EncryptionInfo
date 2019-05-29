package fairy.easy.encryptioninformation.code;

import android.util.Base64;

public class Base64Helper {

    /**
     * 解码
     *
     * @param key 数据
     * @return 字节数组
     */
    public static byte[] decode(String key) {
        return Base64.decode(key.getBytes(), Base64.DEFAULT);
    }

    /**
     * 解码
     *
     * @param key 数据
     * @return 字节数组
     */
    public static byte[] decode(byte[] key) {
        return Base64.decode(key, Base64.DEFAULT);
    }

    /**
     * 编码
     *
     * @param key 数据
     * @return 字节数组
     */
    public static byte[] encode(String key) {
        return Base64.encode(key.getBytes(), Base64.DEFAULT);
    }

    /**
     * 编码
     *
     * @param key 数据
     * @return 字节数组
     */
    public static byte[] encode(byte[] key) {
        return Base64.encode(key, Base64.DEFAULT);
    }
}
