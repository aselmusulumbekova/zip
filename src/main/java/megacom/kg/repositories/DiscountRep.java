package megacom.kg.repositories;

import megacom.kg.models.entities.Discounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRep extends JpaRepository<Discounts,Long> {
}
