package Model;

public abstract class AbstractRole {

    private int idRole;

    public AbstractRole(int idRole) {
        this.idRole = idRole;
    }
    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

}
