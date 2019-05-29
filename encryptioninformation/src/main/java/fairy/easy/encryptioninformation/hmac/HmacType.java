package fairy.easy.encryptioninformation.hmac;

/**
 * @author gunaonian
 * @see <url>"https://developer.android.com/reference/javax/crypto/Mac"
 * Algorithm	Supported API Levels
 * HmacMD5	1+
 * HmacSHA1	1+
 * HmacSHA224	1-8,22+
 * HmacSHA256	1+
 * HmacSHA384	1+
 * HmacSHA512	1+
 * PBEwithHmacSHA	1+
 * PBEwithHmacSHA1	1+
 * PBEwithHmacSHA224	26+
 * PBEwithHmacSHA256	26+
 * PBEwithHmacSHA384	26+
 * PBEwithHmacSHA512	26+
 */
public enum HmacType {

    /**
     * HmacMD5
     */
    HMAC_MD5("HmacMD5"),

    /**
     * HmacSHA1
     */
    HMACS_HA1("HmacSHA1"),

    /**
     * HmacSHA224
     */
    HMAC_SHA224("HmacSHA224"),

    /**
     * HmacSHA256
     */
    HMAC_SHA256("HmacSHA256"),

    /**
     * HmacSHA384
     */
    HMAC_SHA384("HmacSHA384"),

    /**
     * HmacSHA512
     */
    HMAC_SHA512("HmacSHA512"),


    /**
     * PBEwithHmacSHA
     */
    PBE_WITH_HMAC_SHA("PBEwithHmacSHA"),

    /**
     * PBEwithHmacSHA1
     */
    PBE_WITH_HMAC_SHA1("PBEwithHmacSHA1"),

    /**
     * PBEwithHmacSHA224
     */
    PBE_WITH_HMAC_SHA_224("PBEwithHmacSHA224"),

    /**
     * PBEwithHmacSHA256
     */
    PBE_WITH_HMAC_SHA_256("PBEwithHmacSHA256"),

    /**
     * PBEwithHmacSHA384
     */
    PBE_WITH_HMAC_SHA_384("PBEwithHmacSHA384"),

    /**
     * PBEwithHmacSHA512
     */
    PBE_WITH_HMAC_SHA_512("PBEwithHmacSHA512");


    private String typeName;

    HmacType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }
}
