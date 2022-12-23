package megacom.kg.repositories;

import megacom.kg.models.entities.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsRep extends JpaRepository<Channels,Long> {
}
