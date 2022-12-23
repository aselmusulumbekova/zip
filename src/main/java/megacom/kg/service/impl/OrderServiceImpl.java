package megacom.kg.service.impl;

import megacom.kg.mappers.DaysMapper;
import megacom.kg.mappers.OrdersMapper;
import megacom.kg.models.dto.OrdersDTO;
import megacom.kg.repositories.DaysRep;
import megacom.kg.repositories.OrdersRep;
import megacom.kg.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrdersService {
    @Autowired
    OrdersRep rep;
    OrdersMapper mapper=OrdersMapper.INSTANCE;

    @Override
    public OrdersDTO save(OrdersDTO ordersDTO) {
        return mapper.toDto(rep.save(mapper.toEntity(ordersDTO)));
    }

    @Override
    public OrdersDTO findById(Long id) {
        return OrdersMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("")));
    }

    @Override
    public List<OrdersDTO> findAll() {
        return  OrdersMapper.INSTANCE.toDtos(rep.findAll());
    }
}
