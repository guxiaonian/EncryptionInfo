package fairy.easy.encryptioninformation.cipher;

/**
 * @author gunaonian
 * @see <url>"https://developer.android.com/reference/javax/crypto/Cipher"
 */
public enum CipherAsymmetryType {

    /**
     * RSA_ECB_NO_PADDING
     */
    RSA_ECB_NO_PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.ECB, CipherAsymmetryTypePaddings.NO_PADDING),

    /**
     * RSA_ECB_OAEP_PADDING
     */
    RSA_ECB_OAEP_PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.ECB, CipherAsymmetryTypePaddings.OAEP_PADDING),

    /**
     * RSA_ECB_PKCS1_PADDING
     */
    RSA_ECB_PKCS1_PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.ECB, CipherAsymmetryTypePaddings.PKCS1_PADDING),

    /**
     * RSA_ECB_OAEPWITHSHA_1_ANDMGF1PADDING
     */
    RSA_ECB_OAEPWITHSHA_1_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.ECB, CipherAsymmetryTypePaddings.OAEPWITHSHA_1_ANDMGF1PADDING),

    /**
     * RSA_ECB_OAEPWITHSHA_224_ANDMGF1PADDING
     */
    RSA_ECB_OAEPWITHSHA_224_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.ECB, CipherAsymmetryTypePaddings.OAEPWITHSHA_224_ANDMGF1PADDING),

    /**
     * RSA_ECB_OAEPWITHSHA_256_ANDMGF1PADDING
     */
    RSA_ECB_OAEPWITHSHA_256_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.ECB, CipherAsymmetryTypePaddings.OAEPWITHSHA_256_ANDMGF1PADDING),

    /**
     * RSA_ECB_OAEPWITHSHA_384_ANDMGF1PADDING
     */
    RSA_ECB_OAEPWITHSHA_384_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.ECB, CipherAsymmetryTypePaddings.OAEPWITHSHA_384_ANDMGF1PADDING),

    /**
     * RSA_ECB_OAEPWITHSHA_512_ANDMGF1PADDING
     */
    RSA_ECB_OAEPWITHSHA_512_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.ECB, CipherAsymmetryTypePaddings.OAEPWITHSHA_512_ANDMGF1PADDING),

    /**
     * RSA_NONE_NO_PADDING
     */
    RSA_NONE_NO_PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.NONE, CipherAsymmetryTypePaddings.NO_PADDING),

    /**
     * RSA_NONE_OAEP_PADDING
     */
    RSA_NONE_OAEP_PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.NONE, CipherAsymmetryTypePaddings.OAEP_PADDING),

    /**
     * RSA_NONE_PKCS1_PADDING
     */
    RSA_NONE_PKCS1_PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.NONE, CipherAsymmetryTypePaddings.PKCS1_PADDING),

    /**
     * RSA_NONE_OAEPWITHSHA_1_ANDMGF1PADDING
     */
    RSA_NONE_OAEPWITHSHA_1_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.NONE, CipherAsymmetryTypePaddings.OAEPWITHSHA_1_ANDMGF1PADDING),

    /**
     * RSA_NONE_OAEPWITHSHA_224_ANDMGF1PADDING
     */
    RSA_NONE_OAEPWITHSHA_224_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.NONE, CipherAsymmetryTypePaddings.OAEPWITHSHA_224_ANDMGF1PADDING),

    /**
     * RSA_NONE_OAEPWITHSHA_256_ANDMGF1PADDING
     */
    RSA_NONE_OAEPWITHSHA_256_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.NONE, CipherAsymmetryTypePaddings.OAEPWITHSHA_256_ANDMGF1PADDING),

    /**
     * RSA_NONE_OAEPWITHSHA_384_ANDMGF1PADDING
     */
    RSA_NONE_OAEPWITHSHA_384_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.NONE, CipherAsymmetryTypePaddings.OAEPWITHSHA_384_ANDMGF1PADDING),

    /**
     * RSA_NONE_OAEPWITHSHA_512_ANDMGF1PADDING
     */
    RSA_NONE_OAEPWITHSHA_512_ANDMGF1PADDING(CipherAsymmetryTypeAlgorithm.RSA, CipherAsymmetryTypeModes.NONE, CipherAsymmetryTypePaddings.OAEPWITHSHA_512_ANDMGF1PADDING);

    private final CipherAsymmetryTypeAlgorithm cipherAsymmetryTypeAlgorithm;
    private final CipherAsymmetryTypeModes cipherTypeModes;
    private final CipherAsymmetryTypePaddings cipherTypePaddings;

    CipherAsymmetryType(CipherAsymmetryTypeAlgorithm cipherAsymmetryTypeAlgorithm, CipherAsymmetryTypeModes cipherTypeModes, CipherAsymmetryTypePaddings cipherTypePaddings) {
        this.cipherAsymmetryTypeAlgorithm = cipherAsymmetryTypeAlgorithm;
        this.cipherTypeModes = cipherTypeModes;
        this.cipherTypePaddings = cipherTypePaddings;
    }

    public String getCipher() {
        return cipherAsymmetryTypeAlgorithm.getTypeName() + INTERVAL + cipherTypeModes.getTypeName() + INTERVAL + cipherTypePaddings.getTypeName();

    }

    private static final String INTERVAL = "/";

    public enum CipherAsymmetryTypeAlgorithm {

        /**
         * RSA
         */
        RSA("RSA");

        private String typeName;

        CipherAsymmetryTypeAlgorithm(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }

    }

    public enum CipherAsymmetryTypeModes {

        /**
         * NONE
         */
        NONE("NONE"),

        /**
         * ECB
         */
        ECB("ECB");


        private String typeName;

        CipherAsymmetryTypeModes(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }

    }

    public enum CipherAsymmetryTypePaddings {

        /**
         * OAEPPadding
         */
        OAEP_PADDING("OAEPPadding"),

        /**
         * NoPadding
         */
        NO_PADDING("NoPadding"),

        /**
         * PKCS1Padding
         */
        PKCS1_PADDING("PKCS1Padding"),

        /**
         * OAEPwithSHA-1andMGF1Padding
         */
        OAEPWITHSHA_1_ANDMGF1PADDING("OAEPwithSHA-1andMGF1Padding"),

        /**
         * OAEPwithSHA-256andMGF1Padding
         */
        OAEPWITHSHA_256_ANDMGF1PADDING("OAEPwithSHA-256andMGF1Padding"),

        /**
         * OAEPwithSHA-224andMGF1Padding
         */
        OAEPWITHSHA_224_ANDMGF1PADDING("OAEPwithSHA-224andMGF1Padding"),

        /**
         * OAEPwithSHA-384andMGF1Padding
         */
        OAEPWITHSHA_384_ANDMGF1PADDING("OAEPwithSHA-384andMGF1Padding"),

        /**
         * OAEPwithSHA-512andMGF1Padding
         */
        OAEPWITHSHA_512_ANDMGF1PADDING("OAEPwithSHA-512andMGF1Padding");


        private String typeName;

        CipherAsymmetryTypePaddings(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }

    }
}
