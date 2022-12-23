package megacom.kg.models.dto;

import lombok.Getter;
import lombok.Setter;
import megacom.kg.models.enums.OrderStatus;

import java.util.Date;

@Setter
@Getter
public class OrdersDTO {

    Long id;
    String text;
    String name;
    int phone;
    String email;
    int total_price;
    Date editDate;
    Date addDate;
    OrderStatus orderStatus;
}
