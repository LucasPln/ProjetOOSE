package Model;

public class Admin extends AbstractRole {

    private String adminDate;

    public Admin(int idRole) {
        super(idRole);
    }

    public Admin(int idRole, String adminDate) {
        super(idRole);
        this.adminDate = adminDate;
    }

    public String getAdminDate() {
        return adminDate;
    }

    public void setAdminDate(String adminDate) {
        this.adminDate = adminDate;
    }

}
