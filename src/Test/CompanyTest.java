package Test;

import Model.Company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void getName() {
        Company company = new Company("Company");
        assertEquals("Company", company.getName());
    }

    @Test
    void setName() {
        Company company = new Company();
        company.setName("Company");
        assertEquals("Company", company.getName());
    }
}