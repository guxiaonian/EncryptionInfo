package fairy.easy.encryptioninformation.symmetry;

/**
 * @author gunaonian
 * @see <url>"https://developer.android.com/reference/javax/crypto/SecretKeyFactory"
 * Algorithm	Supported API Levels
 * AES	23+
 * DES	1+
 * DESede	1+
 */

public enum SymmetryType {

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

    SymmetryType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }
}
