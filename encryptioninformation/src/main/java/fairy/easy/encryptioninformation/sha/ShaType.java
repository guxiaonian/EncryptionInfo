package fairy.easy.encryptioninformation.sha;

/**
 * @author gunaonian
 * @see <url>"https://developer.android.com/reference/java/security/MessageDigest"
 * Algorithm	Supported API Levels
 * MD5	1+
 * SHA-1	1+
 * SHA-224	1-8,22+
 * SHA-256	1+
 * SHA-384	1+
 * SHA-512	1+
 */

public enum ShaType {

    /**
     * MD5
     */
    MD5("MD5"),

    /**
     * SHA-1
     */
    SHA_1("SHA-1"),

    /**
     * SHA-224
     */
    SHA_224("SHA-224"),

    /**
     * SHA-256
     */
    SHA_256("SHA-256"),

    /**
     * SHA-384
     */
    SHA_384("SHA-384"),

    /**
     * SHA-512
     */
    SHA_512("SHA-512");

    private String typeName;

    ShaType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }
}
