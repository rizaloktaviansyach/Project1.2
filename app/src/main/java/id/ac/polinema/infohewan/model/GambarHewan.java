package id.ac.polinema.infohewan.model;

public class GambarHewan {
    private String image, name, description;

    public GambarHewan(String image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
