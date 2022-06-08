package stefan.anglerparadise.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pictures")
public class PictureEntity extends BaseEntity{

    @Column(nullable = false)
    private String url;

    @ManyToOne
    private FishEntity fish;

    @ManyToOne
    private DamEntity dam;

    public String getUrl() {
        return url;
    }

    public PictureEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public FishEntity getFish() {
        return fish;
    }

    public PictureEntity setFish(FishEntity fish) {
        this.fish = fish;
        return this;
    }

    public DamEntity getDam() {
        return dam;
    }

    public PictureEntity setDam(DamEntity dam) {
        this.dam = dam;
        return this;
    }
}
