package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void Save(Customer customer)  {
        System.out.println("Saved to Db : "+customer.getFirstName()+" "+customer.getLastName() );
    }
}
