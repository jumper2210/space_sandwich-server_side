package sandwich.backend.spaceSandwichBackend.Service;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredients {

    @JsonProperty("meat")
    private String meat;
    @JsonProperty("cheese")
    private String cheese;
    @JsonProperty("salad")
    private String salad;
    @JsonProperty("bacon")
    private String bacon;




    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String getBacon() {
        return bacon;
    }

    public void setBacon(String bacon) {
        this.bacon = bacon;
    }





}