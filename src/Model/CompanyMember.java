package Model;

public class CompanyMember extends AbstractRole{

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    private int idCompany;
    private int idUser;

    public CompanyMember(int idRole) {
        super(idRole);
    }
    public CompanyMember(int idRole,String position,int idCompany,int idUser) {
        super(idRole);
        this.idUser = idUser;
        this.position = position;
        this.idCompany = idCompany;
    }
}
