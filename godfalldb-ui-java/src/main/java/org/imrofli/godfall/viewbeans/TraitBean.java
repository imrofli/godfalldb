package org.imrofli.godfall.viewbeans;

import org.imrofli.godfall.ApiClient;
import org.imrofli.godfall.api.AmuletApi;
import org.imrofli.godfall.api.TraitApi;
import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.Trait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named
public class TraitBean implements Serializable {

    @Autowired
    private ApiClient apiClient;
    private Trait trait;
    private List<Trait> traitList;
    TraitApi traitApi;

    public Trait getTrait(Long id) {

        trait = traitApi.getTraitById(id);
        return trait;
    }


    public void setTraitList(List<Trait> traitList) {
        this.traitList = traitList;
    }

    @PostConstruct
    public void init(){
        apiClient.setBasePath("http://192.168.1.11:8155/api");
        traitApi = new TraitApi();
        traitApi.setApiClient(apiClient);
    }
}
