package concretes;

import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {


    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
