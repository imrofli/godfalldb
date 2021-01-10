package org.imrofli.godfall.viewbeans;

import org.imrofli.godfall.ApiClient;
import org.imrofli.godfall.api.AmuletApi;
import org.imrofli.godfall.api.LootinfoApi;
import org.imrofli.godfall.api.model.Amulet;
import org.imrofli.godfall.api.model.LootInfo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named
public class LootInfoBean implements Serializable {

    @Autowired
    private ApiClient apiClient;
    private LootInfo lootInfo;

    public LootInfo getLootInfo(Long id) {
            apiClient.setBasePath("http://192.168.1.11:8155/api");
            LootinfoApi lootinfoApi = new LootinfoApi();
            lootinfoApi.setApiClient(apiClient);
            lootInfo = lootinfoApi.getLootInfoByAmuletId(id.longValue(), null);
        return lootInfo;
    }

    public void setLootInfo(LootInfo lootInfo) {
        this.lootInfo = lootInfo;
    }

}
