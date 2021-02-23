package org.imrofli.godfall.viewbeans;


import org.imrofli.godfall.ApiClient;
import org.imrofli.godfall.api.AmuletApi;
import org.imrofli.godfall.api.TraitApi;
import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.SelectedTraits;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class BuildAmuletBean implements Serializable {

    @Autowired
    private ApiClient apiClient;
    private AmuletApi amuletApi;
    private TraitApi traitApi;
    private Long amulet;
    private Long traitPrimary;
    private Long traitSecondaryOne;
    private Long traitSecondaryTwo;
    private Long traitSecondaryThree;

    public AmuletApi getAmuletApi() {
        return amuletApi;
    }

    public void setAmuletApi(AmuletApi amuletApi) {
        this.amuletApi = amuletApi;
    }

    public Long getAmulet() {
        return amulet;
    }

    public void setAmulet(Long amulet) {
        this.amulet = amulet;
    }

    public Long getTraitPrimary() {
        return traitPrimary;
    }

    public void setTraitPrimary(Long traitPrimary) {
        this.traitPrimary = traitPrimary;
    }

    public Long getTraitSecondaryOne() {
        return traitSecondaryOne;
    }

    public void setTraitSecondaryOne(Long traitSecondaryOne) {
        this.traitSecondaryOne = traitSecondaryOne;
    }

    public Long getTraitSecondaryTwo() {
        return traitSecondaryTwo;
    }

    public void setTraitSecondaryTwo(Long traitSecondaryTwo) {
        this.traitSecondaryTwo = traitSecondaryTwo;
    }

    public Long getTraitSecondaryThree() {
        return traitSecondaryThree;
    }

    public void setTraitSecondaryThree(Long traitSecondaryThree) {
        this.traitSecondaryThree = traitSecondaryThree;
    }

    @PostConstruct
    public void init(){
        apiClient.setBasePath("http://192.168.1.11:8155/api");
        amuletApi = new AmuletApi();
        amuletApi.setApiClient(apiClient);
        traitApi = new TraitApi();
        traitApi.setApiClient(apiClient);
    }
}


