package org.imrofli.godfall.viewbeans;

import org.imrofli.godfall.ApiClient;
import org.imrofli.godfall.api.AmuletApi;
import org.imrofli.godfall.api.LootinfoApi;
import org.imrofli.godfall.api.TraitApi;
import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.LootInfo;
import org.imrofli.godfall.api.model.Trait;
import org.imrofli.godfall.api.model.TraitType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@Named
public class AmuletBean implements Serializable {

    @Autowired
    private ApiClient apiClient;
    private Amulet amulet;
    private List<Amulet> amuletList;
    private List<Trait> traitList;
    private LootInfo lootInfo;
    private TraitApi traitApi;
    private AmuletApi amuletApi;
    private LootinfoApi lootinfoApi;

    public Amulet getAmulet(Long id) {

        if(amulet == null){
            amulet = amuletApi.getAmuletById(id);
        }
        return amulet;
    }

    public void setAmulet(Amulet amulet) {

        this.amulet = amulet;
    }

    public List<Amulet> getAmuletList() {
        if(amuletList == null || amuletList.isEmpty()){
            amuletList = amuletApi.getAllAmulets(null, null);
        }
        return amuletList;
    }

    public void setAmuletList(List<Amulet> amuletList) {
        this.amuletList = amuletList;
    }

    public List<Trait> getTraitList(Long id) {
        if(traitList == null || amulet == null || amulet.getId() != id) {
            traitList = traitApi.getTraitsByAmuletId(id, null);
        }
        return traitList;
    }

    public LootInfo getLootInfo(Long id) {
        lootInfo = lootinfoApi.getLootInfoByAmuletId(id, null);
        return lootInfo;
    }

    public void setLootInfo(LootInfo lootInfo) {
        this.lootInfo = lootInfo;
    }

    public List<Trait> getPrimaryTraits(Long id){
        getTraitList(id);
        List<Trait> out = new ArrayList<>();
        for(Trait t : traitList){
            if(t.getTraitcategory().getGroupname().equals("PRIMARY_TRAIT")){
                out.add(t);
            }
        }
        return out;
    }

    public String getPrimaryTraitDescription(Long id){
        List<Trait> prims = getPrimaryTraits(id);
        if(prims.size()>1){
            return "Multiple / Random";
        }
        for(Trait t : prims){
            return t.getDescription();
        }
        return "None";
    }

    public List<Trait> getSecondaryTraits(Long id){
        getTraitList(id);
        List<Trait> out = new ArrayList<>();
        for(Trait t : traitList){
            if(TraitType.SECONDARY.equals(t.getTraitcategory().getTraittype()) || TraitType.MASTERWORK.equals(t.getTraitcategory().getTraittype())){
                out.add(t);
            }
        }
        return out;
    }
    public List<Trait> getMasterworkTraits(Long id){
        getTraitList(id);
        List<Trait> out = new ArrayList<>();
        for(Trait t : traitList){
            if(TraitType.MASTERWORK.equals(t.getTraitcategory().getTraittype())){
                out.add(t);
            }
        }
        return out;
    }

    public void setTraitList(List<Trait> traitList) {
        this.traitList = traitList;
    }

    @PostConstruct
    public void init(){
        apiClient.setBasePath("http://192.168.1.11:8155/api");
        amuletApi = new AmuletApi();
        amuletApi.setApiClient(apiClient);
        traitApi = new TraitApi();
        traitApi.setApiClient(apiClient);
        lootinfoApi = new LootinfoApi();
        lootinfoApi.setApiClient(apiClient);
    }
}
