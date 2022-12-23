package megacom.kg.repositories;

import megacom.kg.models.entities.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRep extends JpaRepository<Prices,Long> {
}
