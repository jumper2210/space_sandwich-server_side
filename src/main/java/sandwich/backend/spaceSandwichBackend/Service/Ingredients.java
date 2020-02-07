package sandwich.backend.spaceSandwichBackend.Service;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredients {
    @JsonProperty("wholeGrains")
    private String wholeGrains;
    @JsonProperty("Wheat")
    private String Wheat;
    @JsonProperty("NoGluten")
    private String  NoGluten;
    @JsonProperty("Meat")
    private String Meat;
    @JsonProperty("Cheese")
    private String Cheese;
    @JsonProperty(" Salad")
    private String Salad;
    @JsonProperty("Bacon")
    private String Bacon;
    @JsonProperty("Space")
    private String Space;
    @JsonProperty("Barbecue")
    private String Barbecue;
    @JsonProperty("Ketchup")
    private String  Ketchup;

    public String getWholeGrains() {
        return wholeGrains;
    }

    public void setWholeGrains(String wholeGrains) {
        this.wholeGrains = wholeGrains;
    }

    public String getWheat() {
        return Wheat;
    }

    public void setWheat(String wheat) {
        Wheat = wheat;
    }

    public String getNoGluten() {
        return NoGluten;
    }

    public void setNoGluten(String noGluten) {
        NoGluten = noGluten;
    }

    public String getMeat() {
        return Meat;
    }

    public void setMeat(String meat) {
        Meat = meat;
    }

    public String getCheese() {
        return Cheese;
    }

    public void setCheese(String cheese) {
        Cheese = cheese;
    }

    public String getSalad() {
        return Salad;
    }

    public void setSalad(String salad) {
        Salad = salad;
    }

    public String getBacon() {
        return Bacon;
    }

    public void setBacon(String bacon) {
        Bacon = bacon;
    }

    public String getSpace() {
        return Space;
    }

    public void setSpace(String space) {
        Space = space;
    }

    public String getBarbecue() {
        return Barbecue;
    }

    public void setBarbecue(String barbecue) {
        Barbecue = barbecue;
    }

    public String getKetchup() {
        return Ketchup;
    }

    public void setKetchup(String ketchup) {
        Ketchup = ketchup;
    }



}
