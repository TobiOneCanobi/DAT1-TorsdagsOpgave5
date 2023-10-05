package Task1;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Tobias ", " Hansen ", " Tobi_One_Canobi");
        customers.add(customer1);
        Customer customer2 = new Customer(" Peter "," Janus "," Pepandkage");
        customers.add(customer2);
        Customer customer3 = new Customer(" Henrik "," Thunbo "," Thunbo10");
        customers.add(customer3);
        Customer customer4 = new Customer(" Masih "," xxx "," Joyboy");
        customers.add(customer4);

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers)
    {
        for(Customer i : customers)
        {
            System.out.println(i);
        }
    }
}
