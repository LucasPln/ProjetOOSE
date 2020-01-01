package DAO;

import Model.Glider;

import java.util.ArrayList;

public interface DAOGlider {
    ArrayList<Glider> getGlidersFromCompany(int idCompany);
}
