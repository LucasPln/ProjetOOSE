package Model;

/**
 * The type Type of diploma.
 */
public class TypeOfDiploma {
    private int idTypeDiploma;
    private String Wording;

    /**
     * Instantiates a new Type of diploma.
     *
     * @param idTypeDiploma the id type diploma
     * @param wording       the wording
     */
    public TypeOfDiploma(int idTypeDiploma, String wording) {
        this.idTypeDiploma = idTypeDiploma;
        Wording = wording;
    }

    /**
     * Instantiates a new Type of diploma.
     */
    public TypeOfDiploma() {
    }

    /**
     * Gets id type diploma.
     *
     * @return the id type diploma
     */
    public int getIdTypeDiploma() {
        return idTypeDiploma;
    }

    /**
     * Sets id type diploma.
     *
     * @param idTypeDiploma the id type diploma
     */
    public void setIdTypeDiploma(int idTypeDiploma) {
        this.idTypeDiploma = idTypeDiploma;
    }

    /**
     * Gets wording.
     *
     * @return the wording
     */
    public String getWording() {
        return Wording;
    }

    /**
     * Sets wording.
     *
     * @param wording the wording
     */
    public void setWording(String wording) {
        Wording = wording;
    }
}
