package stefan.anglersparadise.model.binding;

public class AddDamBindingModel {

    private Long id;
    private String name;
    private String type;
    private String fish;
    private String imageUrl;
    private String gpsCoordinates;
    private String description;

    public String getName() {
        return name;
    }

    public AddDamBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public AddDamBindingModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getFish() {
        return fish;
    }

    public AddDamBindingModel setFish(String fish) {
        this.fish = fish;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AddDamBindingModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getGpsCoordinates() {
        return gpsCoordinates;
    }

    public AddDamBindingModel setGpsCoordinates(String gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddDamBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getId() {
        return id;
    }

    public AddDamBindingModel setId(Long id) {
        this.id = id;
        return this;
    }
}
