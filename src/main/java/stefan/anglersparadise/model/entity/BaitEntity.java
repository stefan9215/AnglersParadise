package stefan.anglersparadise.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "baits")
public class BaitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private FishEntity fish;

    public Long getId() {
        return id;
    }

    public BaitEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BaitEntity setName(String name) {
        this.name = name;
        return this;
    }

    public FishEntity getFish() {
        return fish;
    }

    public BaitEntity setFish(FishEntity fish) {
        this.fish = fish;
        return this;
    }
}
