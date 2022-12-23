package megacom.kg.models.dto;

import lombok.Getter;
import lombok.Setter;
import megacom.kg.models.entities.OrderDetail;


@Setter
@Getter
public class DaysDTO {
    Long id;
    int day;
    OrderDetail orderDetailId;
}
