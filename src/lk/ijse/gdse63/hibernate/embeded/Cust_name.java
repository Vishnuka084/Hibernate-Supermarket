package lk.ijse.gdse63.hibernate.embeded;


import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@ToString
public class Cust_name {
    private String f_name;
    private String s_name;
    private String l_name;

}
