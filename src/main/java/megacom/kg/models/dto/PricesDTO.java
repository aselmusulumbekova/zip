package megacom.kg.models.dto;

import lombok.Getter;
import lombok.Setter;
import megacom.kg.models.entities.Channels;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class PricesDTO {
    Long id;
    Channels channelsId;
    Date startDate;
    Date endDate;
    BigDecimal price;

}
