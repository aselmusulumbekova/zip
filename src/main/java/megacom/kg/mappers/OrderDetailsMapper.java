package megacom.kg.mappers;

import megacom.kg.models.dto.OrderDetailsDTO;
import megacom.kg.models.entities.OrderDetail;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OrderDetailsMapper extends BaseMapper<OrderDetail, OrderDetailsDTO>{
    OrderDetailsMapper INSTANCE= Mappers.getMapper(OrderDetailsMapper.class);
}
