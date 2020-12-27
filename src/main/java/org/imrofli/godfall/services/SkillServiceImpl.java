package org.imrofli.godfall.services;

import org.imrofli.godfall.api.model.Skill;
import org.imrofli.godfall.dao.intf.SkillDao;
import org.imrofli.godfall.exception.ServiceCallException;
import org.imrofli.godfall.helpers.DaoToViewInterpreter;
import org.imrofli.godfall.services.intf.SkillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class SkillServiceImpl implements SkillService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SkillServiceImpl.class);
    @Autowired
    private SkillDao skillDao;

    @Override
    public List<Skill> getAllSkills() throws ServiceCallException {
        LOGGER.info("Getting all Skills");
        Set<org.imrofli.godfall.dao.model.Skill> skillSet = skillDao.findAllOrderByName();
        if (skillSet == null || skillSet.isEmpty()) {
            throw new ServiceCallException("skillDao.findAllOrderByName returned NULL");
        }
        List<Skill> out = DaoToViewInterpreter.convertSkillDaoSet(skillSet);
        LOGGER.info("Got {} Skills", out.size());
        return out;
    }

    @Override
    public List<Skill> getAllSkillsByQuery(String name) throws ServiceCallException {
        LOGGER.info("Getting all Skills by query. Name {}", name);
        Set<org.imrofli.godfall.dao.model.Skill> skillSet = skillDao.findAllByNameOrderByName("%" + name + "%");
        if (skillSet == null || skillSet.isEmpty()) {
            throw new ServiceCallException("skillDao.findAllByNameOrderByName returned NULL");
        }
        List<Skill> out = DaoToViewInterpreter.convertSkillDaoSet(skillSet);
        LOGGER.info("Got {} Skills", out.size());
        return out;
    }

    @Override
    public Skill getSkillByID(Long SkillId) throws ServiceCallException {
        LOGGER.info("Getting Skill id: {}", SkillId);
        Optional<org.imrofli.godfall.dao.model.Skill> skill = skillDao.findById(SkillId);
        if (!skill.isPresent()) {
            throw new ServiceCallException("skillDao.findById returned NULL");
        }
        Skill out = DaoToViewInterpreter.convertSkillDao(skill.get());
        return out;
    }
}
