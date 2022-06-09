package stefan.anglersparadise.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dams")
public class DamEntity extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @Lob
    private String description;

    @ManyToOne
    private DamTypeEntity type;

    @Column(name = "gps_coordinates", nullable = false)
    private String gpsCoordinates;

    @OneToMany(mappedBy = "dam")
    private List<FishEntity> fish;

    @OneToMany(mappedBy = "dam")
    private List<PictureEntity> pictures;

    @OneToMany(mappedBy = "dam")
    private List<CommentEntity> comments;

    public String getName() {
        return name;
    }

    public DamEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DamEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public DamTypeEntity getType() {
        return type;
    }

    public DamEntity setType(DamTypeEntity type) {
        this.type = type;
        return this;
    }

    public String getGpsCoordinates() {
        return gpsCoordinates;
    }

    public DamEntity setGpsCoordinates(String gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
        return this;
    }

    public List<FishEntity> getFish() {
        return fish;
    }

    public DamEntity setFish(List<FishEntity> fish) {
        this.fish = fish;
        return this;
    }

    public List<PictureEntity> getPictures() {
        return pictures;
    }

    public DamEntity setPictures(List<PictureEntity> pictures) {
        this.pictures = pictures;
        return this;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public DamEntity setComments(List<CommentEntity> comments) {
        this.comments = comments;
        return this;
    }
}
