package org.imrofli.godfall.viewbeans;


import org.imrofli.godfall.ApiClient;
import org.imrofli.godfall.api.AmuletApi;
import org.imrofli.godfall.api.LootinfoApi;
import org.imrofli.godfall.api.TraitApi;
import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.SelectedTraits;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class BuildCartBean implements Serializable {

    @Autowired
    private ApiClient apiClient;
    private AmuletApi amuletApi;
    private TraitApi traitApi;
    private Amulet amulet;
    private SelectedTraits amuletTraits;

    public AmuletApi getAmuletApi() {
        return amuletApi;
    }

    public void setAmuletApi(AmuletApi amuletApi) {
        this.amuletApi = amuletApi;
    }

    public SelectedTraits getAmuletTraits() {
        if(amuletTraits == null){
            amuletTraits = new SelectedTraits();
        }
        return amuletTraits;
    }
    public String setAmulet(Long amuletId, Long idPrimary, Long idSecondaryOne, Long idSecondaryTwo, Long idSecondaryThree){
        amulet = amuletApi.getAmuletById(amuletId);
        setAmuletTraits(idPrimary, idSecondaryOne, idSecondaryTwo, idSecondaryThree);
        return "?id="+amuletId;
    }

    public void setAmuletTraits(Long idPrimary, Long idSecondaryOne, Long idSecondaryTwo, Long idSecondaryThree) {
        if(amuletTraits == null){
            amuletTraits = new SelectedTraits();
        }
        if(idPrimary != null){
            amuletTraits.setPrimaryTrait(traitApi.getTraitById(idPrimary));
        }
        if(idSecondaryOne != null){
            amuletTraits.setSecondaryTraitOne(traitApi.getTraitById(idSecondaryOne));
        }
        if (idSecondaryTwo!= null){
            amuletTraits.setSecondaryTraitTwo(traitApi.getTraitById(idSecondaryTwo));
        }
        if(idSecondaryThree != null){
            amuletTraits.setSecondaryTraitThree(traitApi.getTraitById(idSecondaryThree));
        }
        System.out.println(amuletTraits.getPrimaryTrait() + " - " + amuletTraits.getSecondaryTraitOne() + " - " + amuletTraits.getSecondaryTraitTwo() + " - " + amuletTraits.getSecondaryTraitThree());
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


