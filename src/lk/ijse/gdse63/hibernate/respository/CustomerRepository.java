package lk.ijse.gdse63.hibernate.respository;


import lk.ijse.gdse63.hibernate.entity.Customer;
import lk.ijse.gdse63.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerRepository {

    private static Session session = FactoryConfiguration.getFactoryConfiguration().getSession();

    //------------------------save Customer------------
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
    //--------------------update customer--------------------------------

    public Integer update(Customer customer){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(customer);
            transaction.commit();
            return 1;

        }catch (Exception e){
            transaction.rollback();
            return -1;
        }
    }

    //--------------getData --------
    public Customer getData(Integer id){
        return session.get(Customer.class,id);
    }


    //-------------delete  customer -----------
    public  boolean delete(Integer id){
        Customer customer =getData(id);
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(customer);
            transaction.commit();
            return true;
        }catch (Exception e){
            transaction.rollback();
            return false;
        }
    }

}
