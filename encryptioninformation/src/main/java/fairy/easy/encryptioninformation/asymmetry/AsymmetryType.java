package fairy.easy.encryptioninformation.asymmetry;

/**
 * @author gunaonian
 * @see <url>"https://developer.android.com/reference/java/security/KeyFactory"
 * Algorithm	Supported API Levels
 * DH	1+
 * DSA	1+
 * EC	11+
 * RSA	1+
 * X.509	1-8
 */

public enum AsymmetryType {

    /**
     * RSA
     */
    RSA("RSA");


    private String typeName;

    AsymmetryType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }
}
