package fairy.easy.encryptioninformation.pbe;


/**
 * @author gunaonian
 * @see <url>"https://developer.android.com/reference/javax/crypto/SecretKeyFactory"
 * Algorithm	Supported API Levels
 * PBEwithHmacSHA1	1+
 * PBEwithHmacSHA1AndAES_128	26+
 * PBEwithHmacSHA1AndAES_256	26+
 * PBEwithHmacSHA224AndAES_128	26+
 * PBEwithHmacSHA224AndAES_256	26+
 * PBEwithHmacSHA256AndAES_128	26+
 * PBEwithHmacSHA256AndAES_256	26+
 * PBEwithHmacSHA384AndAES_128	26+
 * PBEwithHmacSHA384AndAES_256	26+
 * PBEwithHmacSHA512AndAES_128	26+
 * PBEwithHmacSHA512AndAES_256	26+
 * PBEwithMD5AND128BITAES-CBC-OPENSSL	1+
 * PBEwithMD5AND192BITAES-CBC-OPENSSL	1+
 * PBEwithMD5AND256BITAES-CBC-OPENSSL	1+
 * PBEwithMD5ANDDES	1+
 * PBEwithMD5ANDRC2	1+
 * PBEwithSHA1ANDDES	1+
 * PBEwithSHA1ANDRC2	1+
 * PBEwithSHA256AND128BITAES-CBC-BC	1+
 * PBEwithSHA256AND192BITAES-CBC-BC	1+
 * PBEwithSHA256AND256BITAES-CBC-BC	1+
 * PBEwithSHAAND128BITAES-CBC-BC	1+
 * PBEwithSHAAND128BITRC2-CBC	10+
 * PBEwithSHAAND128BITRC4	10+
 * PBEwithSHAAND192BITAES-CBC-BC	1+
 * PBEwithSHAAND2-KEYTRIPLEDES-CBC	1+
 * PBEwithSHAAND256BITAES-CBC-BC	1+
 * PBEwithSHAAND3-KEYTRIPLEDES-CBC	1+
 * PBEwithSHAAND40BITRC2-CBC	1+
 * PBEwithSHAAND40BITRC4	10+
 * PBEwithSHAANDTWOFISH-CBC	10+
 * PBKDF2withHmacSHA1	10+
 * PBKDF2withHmacSHA1And8BIT	19+
 * PBKDF2withHmacSHA224	26+
 * PBKDF2withHmacSHA256	26+
 * PBKDF2withHmacSHA384	26+
 * PBKDF2withHmacSHA512	26+
 */
public enum PBEType {
    /**
     * PBEwithHmacSHA1
     */
    @Deprecated
    PBE_WITH_HMAC_SHA1("PBEwithHmacSHA1"),

    /**
     * PBEwithHmacSHA1AndAES_128
     */
    @Deprecated
    PBE_WITH_HMAC_SHA1_AND_AES_128("PBEwithHmacSHA1AndAES_128"),

    /**
     * PBEwithHmacSHA1AndAES_256
     */
    @Deprecated
    PBE_WITH_HMAC_SHA1_AND_AES_256("PBEwithHmacSHA1AndAES_256"),

    /**
     * PBEwithHmacSHA224AndAES_128
     */
    @Deprecated
    PBE_WITH_HMAC_SHA224_AND_AES_128("PBEwithHmacSHA224AndAES_128"),

    /**
     * PBEwithHmacSHA224AndAES_256
     */
    @Deprecated
    PBE_WITH_HMAC_SHA224_AND_AES_256("PBEwithHmacSHA224AndAES_256"),

    /**
     * PBEwithHmacSHA256AndAES_128
     */
    @Deprecated
    PBE_WITH_HMAC_SHA256_AND_AES_128("PBEwithHmacSHA256AndAES_128"),

    /**
     * PBEwithHmacSHA256AndAES_256
     */
    @Deprecated
    PBE_WITH_HMAC_SHA256_AND_AES_256("PBEwithHmacSHA256AndAES_256"),

    /**
     * PBEwithHmacSHA384AndAES_128
     */
    @Deprecated
    PBE_WITH_HMAC_SHA384_AND_AES_128("PBEwithHmacSHA384AndAES_128"),

    /**
     * PBEwithHmacSHA384AndAES_256
     */
    @Deprecated
    PBE_WITH_HMAC_SHA384_AND_AES_256("PBEwithHmacSHA384AndAES_256"),

    /**
     * PBEwithHmacSHA512AndAES_128
     */
    @Deprecated
    PBE_WITH_HMAC_SHA512_AND_AES_128("PBEwithHmacSHA512AndAES_128"),

    /**
     * PBEwithHmacSHA512AndAES_256
     */
    @Deprecated
    PBE_WITH_HMAC_SHA512_AND_AES_256("PBEwithHmacSHA512AndAES_256"),

    /**
     * PBEwithMD5AND128BITAES-CBC-OPENSSL
     */
    PBE_WITH_MD5_AND_128BIT_AES_CBC_OPENSSL("PBEwithMD5AND128BITAES-CBC-OPENSSL"),

    /**
     * PBEwithMD5AND192BITAES-CBC-OPENSSL
     */
    PBE_WITH_MD5_AND_192BIT_AES_CBC_OPENSSL("PBEwithMD5AND192BITAES-CBC-OPENSSL"),

    /**
     * PBEwithMD5AND256BITAES-CBC-OPENSSL
     */
    PBE_WITH_MD5_AND_256BIT_AES_CBC_OPENSSL("PBEwithMD5AND256BITAES-CBC-OPENSSL"),

    /**
     * PBEwithMD5ANDDES
     */
    PBE_WITH_MD5_AND_DES("PBEwithMD5ANDDES"),

    /**
     * PBEwithMD5ANDRC2
     */
    PBE_WITH_MD5_AND_RC2("PBEwithMD5ANDRC2"),

    /**
     * PBEwithSHA1ANDDES
     */
    PBE_WITH_SHA1_AND_DES("PBEwithSHA1ANDDES"),

    /**
     * PBEwithSHA1ANDRC2
     */
    PBE_WITH_SHA1_AND_RC2("PBEwithSHA1ANDRC2"),

    /**
     * PBEwithSHA256AND128BITAES-CBC-BC
     */
    PBE_WITH_SHA256_AND_128BIT_AES_CBC_BC("PBEwithSHA256AND128BITAES-CBC-BC"),

    /**
     * PBEwithSHA256AND192BITAES-CBC-BC
     */
    PBE_WITH_SHA256_AND_192BIT_AES_CBC_BC("PBEwithSHA256AND192BITAES-CBC-BC"),

    /**
     * PBEwithSHA256AND256BITAES-CBC-BC
     */
    PBE_WITH_SHA256_AND_256BIT_AES_CBC_BC("PBEwithSHA256AND256BITAES-CBC-BC"),

    /**
     * PBEwithSHAAND128BITAES-CBC-BC
     */
    PBE_WITH_SHA_AND_128BIT_AES_CBC_BC("PBEwithSHAAND128BITAES-CBC-BC"),

    /**
     * PBEwithSHAAND128BITRC2-CBC
     */
    PBE_WITH_SHA_AND_128BIT_RC2_CBC("PBEwithSHAAND128BITRC2-CBC"),

    /**
     * PBEwithSHAAND128BITRC4
     */
    PBE_WITH_SHA_AND_128BIT_RC4("PBEwithSHAAND128BITRC4"),

    /**
     * PBEwithSHAAND192BITAES-CBC-BC
     */
    PBE_WITH_SHA_AND_192BIT_AES_CBC_BC("PBEwithSHAAND192BITAES-CBC-BC"),

    /**
     * PBEwithSHAAND2-KEYTRIPLEDES-CBC
     */
    PBE_WITH_SHA_AND2_KEYTRIPLEDES_CBC("PBEwithSHAAND2-KEYTRIPLEDES-CBC"),

    /**
     * PBEwithSHAAND256BITAES-CBC-BC
     */
    PBE_WITH_SHA_AND_256BIT_AES_CBC_BC("PBEwithSHAAND256BITAES-CBC-BC"),

    /**
     * PBEwithSHAAND3-KEYTRIPLEDES-CBC
     */
    PBE_WITH_SHA_AND_3KEYTRIPLEDES_CBC("PBEwithSHAAND3-KEYTRIPLEDES-CBC"),

    /**
     * PBEwithSHAAND40BITRC2-CBC
     */
    PBE_WITH_SHA_AND_40BITR_C2_CBC("PBEwithSHAAND40BITRC2-CBC"),

    /**
     * PBEwithSHAAND40BITRC4
     */
    PBE_WITH_SHA_AND_40BIT_RC4("PBEwithSHAAND40BITRC4"),

    /**
     * PBEwithSHAANDTWOFISH-CBC
     */
    PBE_WITH_SHA_AND_TWO_FISH_CBC("PBEwithSHAANDTWOFISH-CBC");


    private String typeName;

    PBEType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }
}
