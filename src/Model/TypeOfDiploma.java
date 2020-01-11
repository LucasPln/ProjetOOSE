package Model;

public class TypeOfDiploma {
    private int idTypeDiploma;
    private String Wording;

    public TypeOfDiploma(int idTypeDiploma, String wording) {
        this.idTypeDiploma = idTypeDiploma;
        Wording = wording;
    }

    public TypeOfDiploma() {
    }

    public int getIdTypeDiploma() {
        return idTypeDiploma;
    }

    public void setIdTypeDiploma(int idTypeDiploma) {
        this.idTypeDiploma = idTypeDiploma;
    }

    public String getWording() {
        return Wording;
    }

    public void setWording(String wording) {
        Wording = wording;
    }
}
