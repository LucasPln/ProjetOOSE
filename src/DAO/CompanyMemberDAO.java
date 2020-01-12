package DAO;

import Model.User;

import java.util.ArrayList;

public interface CompanyMemberDAO {
    boolean update(int idUser,String position);
    ArrayList<User> getAllCompanyMember();
}
