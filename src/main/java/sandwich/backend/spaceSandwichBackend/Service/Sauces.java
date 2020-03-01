package sandwich.backend.spaceSandwichBackend.Service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sauces {
    @JsonProperty("space")
    private String space;
    @JsonProperty("barbecue")
    private String barbecue;
    @JsonProperty("ketchup")
    private String ketchup;
    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(String barbecue) {
        this.barbecue = barbecue;
    }

    public String getKetchup() {
        return ketchup;
    }

    public void setKetchup(String ketchup) {
        this.ketchup = ketchup;
    }
}
