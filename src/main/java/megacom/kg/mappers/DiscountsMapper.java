package megacom.kg.mappers;

import megacom.kg.models.dto.DiscountsDTO;
import megacom.kg.models.entities.Discounts;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DiscountsMapper extends BaseMapper<Discounts, DiscountsDTO>{
    DiscountsMapper INSTANCE= Mappers.getMapper(DiscountsMapper.class);
}
