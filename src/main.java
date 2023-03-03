import javafx.scene.control.Alert;
import lk.ijse.gdse63.hibernate.embeded.Cust_Phone;
import lk.ijse.gdse63.hibernate.embeded.Cust_name;
import lk.ijse.gdse63.hibernate.entity.Customer;
import lk.ijse.gdse63.hibernate.respository.CustomerRepository;

import java.util.ArrayList;


public class main {
    private static final CustomerRepository customerRepository = new CustomerRepository();

    public static void main(String[] args) {

//----save------
        Customer c1 = new Customer();
        c1.setName(new Cust_name("Saman","Kumara","Gamage"));
        c1.setAge(25);
        ArrayList<Cust_Phone> list = new ArrayList<>();
        list.add(new Cust_Phone("01255454878","home"));
        list.add(new Cust_Phone("4512659979","home"));
        c1.setPhoneNos(list);

        Integer save = customerRepository.save(c1);
        if (save!=-1) {
            System.out.println("Customer ID:" +save);
        }else{
            new Alert(Alert.AlertType.INFORMATION,"Customer not Save").show();
        }

    }

}
