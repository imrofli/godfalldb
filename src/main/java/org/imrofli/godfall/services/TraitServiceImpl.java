package org.imrofli.godfall.services;

import org.imrofli.godfall.dao.intf.TraitDao;
import org.imrofli.godfall.data.*;
import org.imrofli.godfall.models.NamedLootEffect;
import org.imrofli.godfall.models.TraitInfo;
import org.imrofli.godfall.models.WeaponClass;
import org.imrofli.godfall.dao.intf.DataDao;
import org.imrofli.godfall.services.intf.TraitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TraitServiceImpl implements TraitService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TraitServiceImpl.class);
    @Autowired
    private TraitDao traitDao;

    public TraitServiceImpl() {
    }



}
