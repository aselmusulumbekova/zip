package megacom.kg.service.impl;

import megacom.kg.mappers.DaysMapper;
import megacom.kg.models.dto.DaysDTO;
import megacom.kg.repositories.DaysRep;
import megacom.kg.service.DaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaysServiceImpl implements DaysService {
    @Autowired
    DaysRep rep;
    DaysMapper mapper=DaysMapper.INSTANCE;

    @Override
    public DaysDTO save(DaysDTO daysDTO) {
        return mapper.toDto(rep.save(mapper.toEntity(daysDTO)));
    }

    @Override
    public DaysDTO findById(Long id) {
        return DaysMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("")));
    }

    @Override
    public List<DaysDTO> findAll() {
        return  DaysMapper.INSTANCE.toDtos(rep.findAll());
    }
}
