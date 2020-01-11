package Model;

public class GPS extends Equipment {
    private String installedVersion;
    private int idCompany;

    public GPS(int idEquipement, String wording, String installedVersion, int idCompany) {
        super(idEquipement, wording);
        this.installedVersion = installedVersion;
        this.idCompany = idCompany;
    }

    public String getInstalledVersion() {
        return installedVersion;
    }

    public void setInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
    }

    @Override
    public void updateEquipement() {

    }

    @Override
    public void deleteEquipement() {

    }

    @Override
    public void readEquipement() {

    }

    @Override
    public void createEquipement() {

    }
}
