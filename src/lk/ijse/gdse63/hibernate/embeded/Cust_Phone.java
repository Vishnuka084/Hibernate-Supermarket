package lk.ijse.gdse63.hibernate.embeded;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@ToString
public class Cust_Phone {
    private String phone_num;
    private  String type;
}
