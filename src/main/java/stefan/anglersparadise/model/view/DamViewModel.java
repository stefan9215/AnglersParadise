package stefan.anglersparadise.model.view;

public class DamViewModel {

    private Long id;
    private String name;
    private String description;
    private String imageUrl;

    public String getName() {
        return name;
    }

    public DamViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DamViewModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public DamViewModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Long getId() {
        return id;
    }

    public DamViewModel setId(Long id) {
        this.id = id;
        return this;
    }
}
