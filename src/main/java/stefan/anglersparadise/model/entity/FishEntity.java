package stefan.anglersparadise.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "fish")
public class FishEntity extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "fish")
    private List<PictureEntity> pictures;

    @OneToMany(mappedBy = "fish")
    private List<BaitEntity> baits;

    @ManyToOne
    private DamEntity dam;

    public String getName() {
        return name;
    }

    public FishEntity setName(String name) {
        this.name = name;
        return this;
    }

    public List<PictureEntity> getPictures() {
        return pictures;
    }

    public FishEntity setPictures(List<PictureEntity> pictures) {
        this.pictures = pictures;
        return this;
    }

    public List<BaitEntity> getBaits() {
        return baits;
    }

    public FishEntity setBaits(List<BaitEntity> baits) {
        this.baits = baits;
        return this;
    }

    public DamEntity getDam() {
        return dam;
    }

    public FishEntity setDam(DamEntity dam) {
        this.dam = dam;
        return this;
    }
}
