package org.imrofli.godfall.services.intf;


import org.imrofli.godfall.api.model.Skill;
import org.imrofli.godfall.exception.ServiceCallException;

import java.util.List;

public interface SkillService {

    List<Skill> getAllSkills(String version) throws ServiceCallException;

    List<Skill> getAllSkillsByQuery(String name, String version) throws ServiceCallException;

    Skill getSkillByID(Long SkillId) throws ServiceCallException;

}
