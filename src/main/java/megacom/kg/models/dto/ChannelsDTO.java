package megacom.kg.models.dto;

import lombok.Getter;
import lombok.Setter;
import megacom.kg.models.entities.Orders;



@Setter
@Getter
public class ChannelsDTO {
    Long id;
    String name;
    Boolean active;
    int orderNum;
    String photo;
}
