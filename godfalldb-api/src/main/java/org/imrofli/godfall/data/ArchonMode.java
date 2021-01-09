package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ArchonMode {
    private String id;
    private String alwaysOn;
    private String onActivation;
    private List<String> whileActive;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("alwaysOn")
    public String getAlwaysOn() { return alwaysOn; }
    @JsonProperty("alwaysOn")
    public void setAlwaysOn(String value) { this.alwaysOn = value; }

    @JsonProperty("onActivation")
    public String getOnActivation() { return onActivation; }
    @JsonProperty("onActivation")
    public void setOnActivation(String value) { this.onActivation = value; }

    @JsonProperty("whileActive")
    public List<String> getWhileActive() { return whileActive; }
    @JsonProperty("whileActive")
    public void setWhileActive(List<String> value) { this.whileActive = value; }
}
