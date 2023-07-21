import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args)  {
        Customer customer = new Customer();
        customer.setId("200531003778");
        customer.setName("Rayan");
        customer.setAddress("Kalutara");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(customer);
        transaction.commit();
        session.close();
    }
}
