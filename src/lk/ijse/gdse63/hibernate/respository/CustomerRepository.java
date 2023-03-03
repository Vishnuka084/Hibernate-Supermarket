package lk.ijse.gdse63.hibernate.respository;


import lk.ijse.gdse63.hibernate.entity.Customer;
import lk.ijse.gdse63.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerRepository {

    private static Session session = FactoryConfiguration.getFactoryConfiguration().getSession();

    //------------save -------------------------

    public Integer save(Customer customer){
        Transaction transaction = session.beginTransaction();

        try {
            Integer id =(Integer)  session.save(customer);
            transaction.commit();
            return id;

        }catch (Exception e){
            transaction.rollback();
            return -1;
        }

    }

}
