package megacom.kg.service.impl;

import megacom.kg.mappers.DaysMapper;
import megacom.kg.mappers.DiscountsMapper;
import megacom.kg.models.dto.DiscountsDTO;
import megacom.kg.repositories.DaysRep;
import megacom.kg.repositories.DiscountRep;
import megacom.kg.service.DiscountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountsService {
    @Autowired
    DiscountRep rep;
    DiscountsMapper mapper=DiscountsMapper.INSTANCE;
    @Override
    public DiscountsDTO save(DiscountsDTO discountsDTO) {
        return mapper.toDto(rep.save(mapper.toEntity(discountsDTO)));
    }

    @Override
    public DiscountsDTO findById(Long id) {
        return DiscountsMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("")));
    }

    @Override
    public List<DiscountsDTO> findAll() {
        return  DiscountsMapper.INSTANCE.toDtos(rep.findAll());
    }
}
