package megacom.kg.repositories;

import megacom.kg.models.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRep extends JpaRepository<OrderDetail,Long> {

}
