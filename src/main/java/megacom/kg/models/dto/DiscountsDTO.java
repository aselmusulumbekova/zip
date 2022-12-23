package megacom.kg.models.dto;

import lombok.Getter;
import lombok.Setter;
import megacom.kg.models.entities.Channels;

import java.util.Date;

@Setter
@Getter
public class DiscountsDTO {
    Long id;
    Channels channelsId;
    int percent;
    Date startDate;
    Date endDate;
    int minDays;
}
