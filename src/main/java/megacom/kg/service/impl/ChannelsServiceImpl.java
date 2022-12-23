package megacom.kg.service.impl;

import megacom.kg.mappers.ChannelsMapper;
import megacom.kg.microservices.FileServiceFeign;
import megacom.kg.models.dto.ChannelsDTO;
import megacom.kg.repositories.ChannelsRep;
import megacom.kg.service.ChannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelsServiceImpl implements ChannelsService {
    @Autowired
    ChannelsRep rep;



    ChannelsMapper mapper=ChannelsMapper.INSTANCE;

    @Override
    public ChannelsDTO save(ChannelsDTO channelsDTO) {
        return mapper.toDto(rep.save(mapper.toEntity(channelsDTO)));
    }

    @Override
    public ChannelsDTO findById(Long id) {
        return ChannelsMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("")));
    }

    @Override
    public List<ChannelsDTO> findAll() {
        return ChannelsMapper.INSTANCE.toDtos(rep.findAll());

    }
}
