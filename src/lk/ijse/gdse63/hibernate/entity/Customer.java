package lk.ijse.gdse63.hibernate.entity;


import lk.ijse.gdse63.hibernate.embeded.Cust_Phone;
import lk.ijse.gdse63.hibernate.embeded.Cust_name;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cus_name" , length = 120)
    private Cust_name name;
    @Column(name = "cus_age", columnDefinition = "SMALLINT")
    private int age;
    @ElementCollection
    @CollectionTable(
            name = "cus_name",
            joinColumns = @JoinColumn(name = "cus_id")
    )
    private List<Cust_Phone>phoneNos;


}
