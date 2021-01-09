package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Currencies {
    private List<CurrenciesCollection> collection;

    @JsonProperty("collection")
    public List<CurrenciesCollection> getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(List<CurrenciesCollection> value) { this.collection = value; }
}
