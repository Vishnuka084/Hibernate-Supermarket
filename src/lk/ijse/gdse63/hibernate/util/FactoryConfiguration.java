package lk.ijse.gdse63.hibernate.util;


import lk.ijse.gdse63.hibernate.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {

    public static FactoryConfiguration factoryConfiguration;

    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Customer.class).
                addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class)
                .addAnnotatedClass(Client.class).addAnnotatedClass(Vehicle.class).addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Task.class);
        sessionFactory=configuration.buildSessionFactory();

    }

    public static FactoryConfiguration getFactoryConfiguration(){
        return factoryConfiguration==null ? factoryConfiguration=new FactoryConfiguration():
                factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
