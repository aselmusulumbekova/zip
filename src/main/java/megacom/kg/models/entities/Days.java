package megacom.kg.models.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@Entity
@Table(name="tb_days")
public class Days {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int day;

    @ManyToOne
    @JoinColumn(name = "id_order_details")
    OrderDetail orderDetailId;
}
