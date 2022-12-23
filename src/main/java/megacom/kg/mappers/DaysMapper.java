package megacom.kg.mappers;

import megacom.kg.models.dto.DaysDTO;
import megacom.kg.models.entities.Days;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DaysMapper extends BaseMapper<Days, DaysDTO>{
    DaysMapper INSTANCE = Mappers.getMapper(DaysMapper.class);

}
