package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager {

    public StarBucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    CustomerCheckService customerCheckService;


    @Override
    public void Save(Customer customer) {

        if (customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }else {
            System.out.println("Not a valid Person");
        }


    }


}
