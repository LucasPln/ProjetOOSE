package Model;

/**
 * The type User.
 */
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String adress;
    private String postalCode;
    private String mail;
    private String tel;
    private String login;
    private String password;

    private AbstractRole abstractRole;

    /**
     * Instantiates a new User.
     *
     * @param id         the id
     * @param firstName  the first name
     * @param lastName   the last name
     * @param birthDate  the birth date
     * @param adress     the adress
     * @param postalCode the postal code
     * @param mail       the mail
     * @param tel        the tel
     * @param login      the login
     * @param password   the password
     */
    public User(int id, String firstName, String lastName, String birthDate, String adress, String postalCode, String mail, String tel, String login, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.adress = adress;
        this.postalCode = postalCode;
        this.mail = mail;
        this.tel = tel;
        this.login = login;
        this.password = password;
    }

    /**
     * Get user user.
     *
     * @return the user
     */
    public User getUser(){return this;}

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets birth date.
     *
     * @return the birth date
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets birth date.
     *
     * @param birthDate the birth date
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Gets adress.
     *
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets adress.
     *
     * @param adress the adress
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * Gets postal code.
     *
     * @return the postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets postal code.
     *
     * @param postalCode the postal code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets mail.
     *
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets mail.
     *
     * @param mail the mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Gets tel.
     *
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets tel.
     *
     * @param tel the tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Gets login.
     *
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets login.
     *
     * @param login the login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets abstract role.
     *
     * @return the abstract role
     */
    public AbstractRole getAbstractRole() {
        return abstractRole;
    }

    /**
     * Sets abstract role.
     *
     * @param abstractRole the abstract role
     */
    public void setAbstractRole(AbstractRole abstractRole) {
        this.abstractRole = abstractRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    /**
     * Get company id int.
     *
     * @return the int
     */
    public int getCompanyId(){
        int id=0;
        if (abstractRole instanceof Monitor){
            id = ((Monitor) abstractRole).getIdCompany();
        }
        else if(abstractRole instanceof CompanyMember){
            id = ((CompanyMember) abstractRole).getIdCompany();
        }

        return id;
    }

}
