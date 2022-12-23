package megacom.kg.mappers;

import megacom.kg.models.dto.PricesDTO;
import megacom.kg.models.entities.Prices;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface PricesMapper extends BaseMapper<Prices, PricesDTO>{
   PricesMapper INSTANCE= Mappers.getMapper(PricesMapper.class);
}
