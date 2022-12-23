package megacom.kg.service.impl;

import megacom.kg.mappers.DaysMapper;
import megacom.kg.mappers.PricesMapper;
import megacom.kg.models.dto.PricesDTO;
import megacom.kg.repositories.DaysRep;
import megacom.kg.repositories.PricesRep;
import megacom.kg.service.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricesServiceImpl implements PricesService {
    @Autowired
    PricesRep rep;
    PricesMapper mapper=PricesMapper.INSTANCE;
    @Override
    public PricesDTO save(PricesDTO pricesDTO) {
        return mapper.toDto(rep.save(mapper.toEntity(pricesDTO)));
    }

    @Override
    public PricesDTO findById(Long id) {
        return PricesMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("")));
    }

    @Override
    public List<PricesDTO> findAll() {
        return  PricesMapper.INSTANCE.toDtos(rep.findAll());
    }
}
