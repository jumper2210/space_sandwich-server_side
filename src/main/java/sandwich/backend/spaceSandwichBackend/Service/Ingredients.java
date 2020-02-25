package sandwich.backend.spaceSandwichBackend.Service;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredients {
    @JsonProperty("wholeGrains")
    private String wholeGrains;
    @JsonProperty("wheat")
    private String wheat;
    @JsonProperty("noGluten")
    private String noGluten;
    @JsonProperty("meat")
    private String meat;
    @JsonProperty("cheese")
    private String cheese;
    @JsonProperty("salad")
    private String salad;
    @JsonProperty("bacon")
    private String bacon;
    @JsonProperty("space")
    private String space;
    @JsonProperty("barbecue")
    private String barbecue;
    @JsonProperty("ketchup")
    private String ketchup;

    public String getWholeGrains() {
        return wholeGrains;
    }

    public void setWholeGrains(String wholeGrains) {
        this.wholeGrains = wholeGrains;
    }

    public String getWheat() {
        return wheat;
    }

    public void setWheat(String wheat) {
        wheat = wheat;
    }

    public String getNoGluten() {
        return noGluten;
    }

    public void setNoGluten(String noGluten) {
        noGluten = noGluten;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        cheese = cheese;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        salad = salad;
    }

    public String getBacon() {
        return bacon;
    }

    public void setBacon(String bacon) {
        bacon = bacon;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        space = space;
    }

    public String getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(String barbecue) {
        barbecue = barbecue;
    }

    public String getKetchup() {
        return ketchup;
    }

    public void setKetchup(String ketchup) {
        ketchup = ketchup;
    }



}
