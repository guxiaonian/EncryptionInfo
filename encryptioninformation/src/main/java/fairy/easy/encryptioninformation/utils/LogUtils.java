package fairy.easy.encryptioninformation.utils;

import android.util.Log;

import fairy.easy.encryptioninformation.EncryptionHelper;

public class LogUtils {

    private static final String TAG = EncryptionHelper.class.getSimpleName() + "-" + EncryptionHelper.getVersion();

    public static void i(String tag, String value) {
        Log.i(TAG + "-" + tag, value);
    }

    public static void e(String tag, String value) {
        Log.e(TAG + "-" + tag, value);
    }
}
