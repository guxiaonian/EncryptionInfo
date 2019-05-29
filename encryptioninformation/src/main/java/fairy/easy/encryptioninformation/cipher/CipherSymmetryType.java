package fairy.easy.encryptioninformation.cipher;

/**
 * @author gunaonian
 * @see <url>"https://developer.android.com/reference/javax/crypto/Cipher"
 */
public enum CipherSymmetryType {

    //--------------------------------AES----------------------------------
    //---------------------------------------------------------------------

    /**
     * AES_CBC_ISO10126PADDING
     */
    AES_CBC_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CBC, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * AES_CBC_NO_PADDING
     */
    AES_CBC_NO_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CBC, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * AES_CBC_PKCS5_PADDING
     */
    AES_CBC_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CBC, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * AES_CFB_ISO10126PADDING
     */
    AES_CFB_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CFB, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * AES_CFB_NO_PADDING
     */
    AES_CFB_NO_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CFB, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * AES_CFB_PKCS5_PADDING
     */
    AES_CFB_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CFB, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * AES_CTR_ISO10126PADDING
     */
    AES_CTR_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CTR, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * AES_CTR_NO_PADDING
     */
    AES_CTR_NO_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CTR, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * AES_CTR_PKCS5_PADDING
     */
    AES_CTR_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CTR, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * AES_CTS_ISO10126PADDING
     */
    AES_CTS_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CTS, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * AES_CTS_NO_PADDING
     */
    AES_CTS_NO_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CTS, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * AES_CTS_PKCS5_PADDING
     */
    AES_CTS_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.CTS, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * AES_ECB_ISO10126PADDING
     */
    AES_ECB_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.ECB, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * AES_ECB_NO_PADDING
     */
    AES_ECB_NO_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.ECB, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * AES_ECB_PKCS5_PADDING
     */
    AES_ECB_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.ECB, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * AES_OFB_ISO10126PADDING
     */
    AES_OFB_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.OFB, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * AES_OFB_NO_PADDING
     */
    AES_OFB_NO_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.OFB, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * AES_OFB_PKCS5_PADDING
     */
    AES_OFB_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.OFB, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * AES_GCM_NO_PADDING
     */
    AES_GCM_NO_PADDING(CipherSymmetryTypeAlgorithm.AES, CipherSymmetryTypeModes.GCM, CipherSymmetryTypePaddings.NO_PADDING),


    //--------------------------------DES----------------------------------
    //---------------------------------------------------------------------

    /**
     * DES_CBC_ISO10126PADDING
     */
    DES_CBC_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CBC, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DES_CBC_NO_PADDING
     */
    DES_CBC_NO_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CBC, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DES_CBC_PKCS5_PADDING
     */
    DES_CBC_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CBC, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DES_CFB_ISO10126PADDING
     */
    DES_CFB_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CFB, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DES_CFB_NO_PADDING
     */
    DES_CFB_NO_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CFB, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DES_CFB_PKCS5_PADDING
     */
    DES_CFB_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CFB, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DES_CTR_ISO10126PADDING
     */
    DES_CTR_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CTR, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DES_CTR_NO_PADDING
     */
    DES_CTR_NO_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CTR, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DES_CTR_PKCS5_PADDING
     */
    DES_CTR_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CTR, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DES_CTS_ISO10126PADDING
     */
    DES_CTS_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CTS, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DES_CTS_NO_PADDING
     */
    DES_CTS_NO_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CTS, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DES_CTS_PKCS5_PADDING
     */
    DES_CTS_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.CTS, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DES_ECB_ISO10126PADDING
     */
    DES_ECB_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.ECB, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DES_ECB_NO_PADDING
     */
    DES_ECB_NO_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.ECB, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DES_ECB_PKCS5_PADDING
     */
    DES_ECB_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.ECB, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DES_OFB_ISO10126PADDING
     */
    DES_OFB_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.OFB, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DES_OFB_NO_PADDING
     */
    DES_OFB_NO_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.OFB, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DES_OFB_PKCS5_PADDING
     */
    DES_OFB_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DES, CipherSymmetryTypeModes.OFB, CipherSymmetryTypePaddings.PKCS5_PADDING),

    //--------------------------------DESede----------------------------------
    //---------------------------------------------------------------------

    /**
     * DESEDE_CBC_ISO10126PADDING
     */
    DESEDE_CBC_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CBC, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DESEDE_CBC_NO_PADDING
     */
    DESEDE_CBC_NO_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CBC, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DESEDE_CBC_PKCS5_PADDING
     */
    DESEDE_CBC_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CBC, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DESEDE_CFB_ISO10126PADDING
     */
    DESEDE_CFB_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CFB, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DESEDE_CFB_NO_PADDING
     */
    DESEDE_CFB_NO_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CFB, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DESEDE_CFB_PKCS5_PADDING
     */
    DESEDE_CFB_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CFB, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DESEDE_CTR_ISO10126PADDING
     */
    DESEDE_CTR_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CTR, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DESEDE_CTR_NO_PADDING
     */
    DESEDE_CTR_NO_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CTR, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DESEDE_CTR_PKCS5_PADDING
     */
    DESEDE_CTR_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CTR, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DESEDE_CTS_ISO10126PADDING
     */
    DESEDE_CTS_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CTS, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DESEDE_CTS_NO_PADDING
     */
    DESEDE_CTS_NO_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CTS, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DESEDE_CTS_PKCS5_PADDING
     */
    DESEDE_CTS_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.CTS, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DESEDE_ECB_ISO10126PADDING
     */
    DESEDE_ECB_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.ECB, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DESEDE_ECB_NO_PADDING
     */
    DESEDE_ECB_NO_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.ECB, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DESEDE_ECB_PKCS5_PADDING
     */
    DESEDE_ECB_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.ECB, CipherSymmetryTypePaddings.PKCS5_PADDING),

    /**
     * DESEDE_OFB_ISO10126PADDING
     */
    DESEDE_OFB_ISO_10126_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.OFB, CipherSymmetryTypePaddings.ISO_10126_PADDING),

    /**
     * DESEDE_OFB_NO_PADDING
     */
    DESEDE_OFB_NO_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.OFB, CipherSymmetryTypePaddings.NO_PADDING),

    /**
     * DESEDE_OFB_PKCS5_PADDING
     */
    DESEDE_OFB_PKCS5_PADDING(CipherSymmetryTypeAlgorithm.DESEDE, CipherSymmetryTypeModes.OFB, CipherSymmetryTypePaddings.PKCS5_PADDING);


    private final CipherSymmetryTypeAlgorithm cipherSymmetryTypeAlgorithm;
    private final CipherSymmetryTypeModes cipherTypeModes;
    private final CipherSymmetryTypePaddings cipherTypePaddings;

    CipherSymmetryType(CipherSymmetryTypeAlgorithm cipherSymmetryTypeAlgorithm, CipherSymmetryTypeModes cipherTypeModes, CipherSymmetryTypePaddings cipherTypePaddings) {
        this.cipherSymmetryTypeAlgorithm = cipherSymmetryTypeAlgorithm;
        this.cipherTypeModes = cipherTypeModes;
        this.cipherTypePaddings = cipherTypePaddings;
    }

    public String getCipher() {
        return cipherSymmetryTypeAlgorithm.getTypeName() + INTERVAL + cipherTypeModes.getTypeName() + INTERVAL + cipherTypePaddings.getTypeName();
    }

    private static final String INTERVAL = "/";

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
