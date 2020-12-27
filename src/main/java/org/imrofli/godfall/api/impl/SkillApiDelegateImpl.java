package org.imrofli.godfall.api.impl;

import org.imrofli.godfall.api.SkillApiDelegate;
import org.imrofli.godfall.api.model.Skill;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.services.intf.SkillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillApiDelegateImpl implements SkillApiDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(SkillApiDelegateImpl.class);
    @Autowired
    SkillService skillService;

    @Override
    public ResponseEntity<List<Skill>> getAllSkills(String name) {
        LOGGER.info("Call to getAllSkills. Query: name {}", name);
        List<Skill> outSkills = null;
        try {
            if (name != null && !name.isEmpty()) {
                outSkills = skillService.getAllSkillsByQuery(name);
            } else {
                outSkills = skillService.getAllSkills();
            }
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (outSkills != null && !outSkills.isEmpty()) {
            return ResponseEntity.ok(outSkills);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Skill> getSkillById(Long id) {
        LOGGER.info("Call to getSkillById. ID {}", id);
        Skill out = null;
        try {
            out = skillService.getSkillByID(id);
        } catch (ServiceCallException e) {
            LOGGER.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
        if (out != null) {
            return ResponseEntity.ok(out);
        }
        return ResponseEntity.notFound().build();
    }

}
