package megacom.kg.repositories;

import megacom.kg.models.entities.Days;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaysRep extends JpaRepository<Days,Long> {
}
