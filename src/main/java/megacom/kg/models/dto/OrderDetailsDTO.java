package megacom.kg.models.dto;

import lombok.Getter;
import lombok.Setter;
import megacom.kg.models.entities.Channels;
import megacom.kg.models.entities.Orders;

@Setter
@Getter
public class OrderDetailsDTO {
    Long id;
    Channels channelsId;
    Orders ordersId;
    int price;
}
