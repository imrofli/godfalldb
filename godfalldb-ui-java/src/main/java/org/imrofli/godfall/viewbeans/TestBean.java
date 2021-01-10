package org.imrofli.godfall.viewbeans;


import org.imrofli.godfall.ApiClient;
import org.imrofli.godfall.api.AmuletApi;
import org.imrofli.godfall.api.model.Amulet;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named
public class TestBean implements Serializable {

    @Autowired
    private ApiClient apiClient;
    private String value = "Irgendöppis";
    private List<Amulet> amuletList;

    public String getValue() {
        apiClient.setBasePath("http://192.168.1.11:8155/api");
        AmuletApi amuletApi = new AmuletApi();
        amuletApi.setApiClient(apiClient);
        List<Amulet> amulets = amuletApi.getAllAmulets(null, null);
        StringBuilder stringBuilder = new StringBuilder();
        for(Amulet a : amulets){
            stringBuilder.append(a.getDisplayname() + " | ");
        }
        value = stringBuilder.toString();
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Amulet> getAmuletList() {
        if(amuletList == null || amuletList.isEmpty()){
            apiClient.setBasePath("http://192.168.1.11:8155/api");
            AmuletApi amuletApi = new AmuletApi();
            amuletApi.setApiClient(apiClient);
            amuletList = amuletApi.getAllAmulets(null, null);
        }
        return amuletList;
    }

    public void setAmuletList(List<Amulet> amuletList) {
        this.amuletList = amuletList;
    }
}
