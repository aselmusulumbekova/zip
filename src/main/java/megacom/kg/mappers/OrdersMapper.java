package megacom.kg.mappers;

import megacom.kg.models.dto.OrdersDTO;
import megacom.kg.models.entities.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OrdersMapper extends  BaseMapper<Orders, OrdersDTO> {
   OrdersMapper INSTANCE= Mappers.getMapper(OrdersMapper.class);
}
