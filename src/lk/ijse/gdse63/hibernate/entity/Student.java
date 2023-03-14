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
@Entity(name = "student")
@Table(name = "studnt")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "student_name")
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laptop_Id")
    private Laptop laptop;

}
