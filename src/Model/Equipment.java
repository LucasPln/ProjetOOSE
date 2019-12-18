package Model;

public abstract class Equipment {
    int idEquipement;
    String wording;
    // liste dispo

    public abstract void updateEquipement();
    public abstract void deleteEquipement();
    public abstract void readEquipement();
    public abstract void createEquipement();

    public void getDisponibilite(){};
    public void updateDisponibilite(){};

    public int getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(int idEquipement) {
        this.idEquipement = idEquipement;
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }

}
