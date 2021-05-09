import Adapter.MernisServiceAdapter;
import abstracts.BaseCustomerManager;
import concretes.NeroCustomerManager;
import concretes.StarBucksCustomerManager;
import entities.Customer;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BaseCustomerManager customerManager=new StarBucksCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(1,"Şükrü","Akkoyun",1988,"28933866746"));
    }
}
