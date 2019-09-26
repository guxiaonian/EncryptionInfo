package fairy.easy.encryptioninformation.utils;

import java.security.SecureRandom;

public class RandomUtil {

    /**
     * PBE加密专用盐
     *
     * @return 盐
     */
    public static byte[] secureRandom2Bytes() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.generateSeed(8);
    }
}
