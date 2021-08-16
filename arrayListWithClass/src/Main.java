import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Customer> customers= new ArrayList<Customer>();
        customers.add(new Customer(1,"ayse","ykaya"));
        customers.add(new Customer(2,"seyma","ykaya"));
        customers.add(new Customer(3,"feyza","ykaya"));

        for(Customer customer: customers){
            System.out.println(customer.name);
        }

    }
}
