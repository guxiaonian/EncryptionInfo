package fairy.easy.encryptioninformation.cipher;

/**
 * @author gunaonian
 * @see <url>"https://developer.android.com/reference/javax/crypto/Cipher"
 */
public class CipherSymmetryType {
    private static final String INTERVAL = "/";
    private final CipherSymmetryTypeAlgorithm cipherSymmetryTypeAlgorithm;
    private final CipherSymmetryTypeModes cipherTypeModes;
    private final CipherSymmetryTypePaddings cipherTypePaddings;

    public CipherSymmetryType(CipherSymmetryTypeAlgorithm cipherSymmetryTypeAlgorithm, CipherSymmetryTypeModes cipherTypeModes, CipherSymmetryTypePaddings cipherTypePaddings) {
        this.cipherSymmetryTypeAlgorithm = cipherSymmetryTypeAlgorithm;
        this.cipherTypeModes = cipherTypeModes;
        this.cipherTypePaddings = cipherTypePaddings;
    }

    public String getCipher() {
        return cipherSymmetryTypeAlgorithm.getTypeName() + INTERVAL + cipherTypeModes.getTypeName() + INTERVAL + cipherTypePaddings.getTypeName();
    }


    public enum CipherSymmetryTypeAlgorithm {

        /**
         * AES
         */
        AES("AES"),

        /**
         * DES
         */
        DES("DES"),

        /**
         * DESede
         */
        DESEDE("DESede");

        private String typeName;

        CipherSymmetryTypeAlgorithm(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }

    }

    public enum CipherSymmetryTypeModes {

        /**
         * CBC
         */
        CBC("CBC"),

        /**
         * CFB
         */
        CFB("CFB"),

        /**
         * CTR
         */
        CTR("CTR"),

        /**
         * ECB
         */
        ECB("ECB"),

        /**
         * OFB
         */
        OFB("OFB"),

        /**
         * CTS
         */
        CTS("CTS"),

        /**
         * GCM
         */
        GCM("GCM");

        private String typeName;

        CipherSymmetryTypeModes(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }

    }

    public enum CipherSymmetryTypePaddings {

        /**
         * ISO10126Padding
         */
        ISO_10126_PADDING("ISO10126Padding"),

        /**
         * NoPadding
         */
        NO_PADDING("NoPadding"),

        /**
         * PKCS5Padding
         */
        PKCS5_PADDING("PKCS5Padding");


        private String typeName;

        CipherSymmetryTypePaddings(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }

    }
}
