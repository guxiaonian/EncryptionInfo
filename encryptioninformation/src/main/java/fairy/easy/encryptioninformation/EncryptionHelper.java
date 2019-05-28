package fairy.easy.encryptioninformation;

import fairy.easy.encryptioninformation.sha.ShaHelper;

/**
 * @author gunaonian
 */
public class EncryptionHelper {

    /**
     * 加密总类
     *
     * @param encryptionType 区分加密
     * @return 加密类
     */
    public static <T extends EncryptionInterface> T getEncryptParam(EncryptionType encryptionType) {
        switch (encryptionType.ordinal()) {
            case 0:
                return (T) new ShaHelper();
            default:
                return null;

        }
    }

}