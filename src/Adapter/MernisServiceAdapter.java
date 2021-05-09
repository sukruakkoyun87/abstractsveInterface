package Adapter;

import MernisService.QQHKPSPublicSoap;
import abstracts.CustomerCheckService;
import entities.Customer;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        QQHKPSPublicSoap client=new QQHKPSPublicSoap();

       try {
           return client.TCKimlikNoDogrula(
                   Long.parseLong(customer.getNationalityId()),
                   customer.getFirstName().toUpperCase(),
                   customer.getLastName().toUpperCase(),
                   customer.getDateOfBirth());
       }
       catch (Exception e)
       {
           System.out.println("Error Message : "+e.getMessage());
       }
       return false;
    }
}
