package megacom.kg.mappers;

import megacom.kg.models.dto.ChannelsDTO;
import megacom.kg.models.entities.Channels;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ChannelsMapper extends BaseMapper<Channels, ChannelsDTO> {
    ChannelsMapper INSTANCE= Mappers.getMapper(ChannelsMapper.class);

}
