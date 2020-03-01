package sandwich.backend.spaceSandwichBackend.Service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BreadTypes {
    @JsonProperty("wholeGrains")
    private String wholeGrains;
    @JsonProperty("wheat")
    private String wheat;
    @JsonProperty("noGluten")
    private String noGluten;
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
        this.wheat = wheat;
    }

    public String getNoGluten() {
        return noGluten;
    }

    public void setNoGluten(String noGluten) {
        this.noGluten = noGluten;
    }
}
