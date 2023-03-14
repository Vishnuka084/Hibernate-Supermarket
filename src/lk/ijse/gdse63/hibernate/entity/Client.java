package lk.ijse.gdse63.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "client")
@ToString
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name = "client_name",length = 120)
    private String name;
    @OneToMany(mappedBy = "client",targetEntity = Vehicle.class)
    private List<Vehicle>vehicleList;
}
