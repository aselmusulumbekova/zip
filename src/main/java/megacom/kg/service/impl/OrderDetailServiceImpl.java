package megacom.kg.service.impl;

import megacom.kg.mappers.DaysMapper;
import megacom.kg.mappers.DiscountsMapper;
import megacom.kg.mappers.OrderDetailsMapper;
import megacom.kg.mappers.OrdersMapper;
import megacom.kg.models.dto.OrderDetailsDTO;
import megacom.kg.repositories.DaysRep;
import megacom.kg.repositories.OrderDetailRep;
import megacom.kg.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    OrderDetailRep rep;
    OrderDetailsMapper mapper= OrderDetailsMapper.INSTANCE;
    @Override
    public OrderDetailsDTO save(OrderDetailsDTO orderDetailsDTO) {
        return mapper.toDto(rep.save(mapper.toEntity(orderDetailsDTO)));
    }

    @Override
    public OrderDetailsDTO findById(Long id) {
        return OrderDetailsMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("")));
    }

    @Override
    public List<OrderDetailsDTO> findAll() {
        return  OrderDetailsMapper.INSTANCE.toDtos(rep.findAll());
    }
}
