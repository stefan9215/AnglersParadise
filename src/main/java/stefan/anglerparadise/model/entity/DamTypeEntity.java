package stefan.anglerparadise.model.entity;

import stefan.anglerparadise.model.entity.enums.DamTypeEnum;

import javax.persistence.*;

@Entity
@Table(name = "dam_types")
public class DamTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DamTypeEnum type;

    public Long getId() {
        return id;
    }

    public DamTypeEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public DamTypeEnum getType() {
        return type;
    }

    public DamTypeEntity setType(DamTypeEnum type) {
        this.type = type;
        return this;
    }
}
