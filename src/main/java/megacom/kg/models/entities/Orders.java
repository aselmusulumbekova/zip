package megacom.kg.models.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import megacom.kg.models.enums.OrderStatus;

import jakarta.persistence.*;
import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@Entity
@Table(name="tb_orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String text;
    String name;
    int phone;
    String email;
    int total_price;
    Date editDate;
    Date addDate;
    OrderStatus status;



}
