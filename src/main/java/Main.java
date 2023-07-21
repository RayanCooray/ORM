import entity.Customer;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args)  {
        Customer customer = new Customer();
        customer.setId("200531003778");
        customer.setName("Rayan");
        customer.setAddress("Kalutara");

        Session session = FactoryConfiguration.getInstance().getSession();
        session.persist(customer);
        //session.beginTransaction();
        session.close();
    }
}
