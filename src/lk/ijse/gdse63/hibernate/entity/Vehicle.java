package lk.ijse.gdse63.hibernate.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity(name = "client")
@Table(name = "client")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "type")
    private String type;


}
