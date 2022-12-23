package megacom.kg.models.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;



import java.math.BigDecimal;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@Entity
@Table(name="tb_channels")
public class Channels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "active")
    Boolean active;
    @Column(name = "order_num")
    int orderNum;
    @Column(name = "photo")
    String photo;
    @Column(name = "price")
    BigDecimal price;

}
