package stefan.anglersparadise.model.service;

public class AddDamServiceModel {

    private String name;
    private String type;
    private String fish;
    private String imageUrl;
    private String gpsCoordinates;
    private String description;


    public String getName() {
        return name;
    }

    public AddDamServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public AddDamServiceModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getFish() {
        return fish;
    }

    public AddDamServiceModel setFish(String fish) {
        this.fish = fish;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AddDamServiceModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getGpsCoordinates() {
        return gpsCoordinates;
    }

    public AddDamServiceModel setGpsCoordinates(String gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddDamServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
