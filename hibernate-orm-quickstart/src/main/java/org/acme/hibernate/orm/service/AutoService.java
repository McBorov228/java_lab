package org.acme.hibernate.orm.service;

import org.acme.hibernate.orm.pojo.Auto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class AutoService {

    @Inject
    EntityManager entityManager;

    @Transactional
    public Auto insertAuto(Auto auto) {
        entityManager.persist(auto);
        entityManager.flush();
        return auto;
    }

    @Transactional
    public Auto updateAuto(Auto auto) {
        entityManager.merge(auto);
        entityManager.flush();
        return auto;
    }

    @Transactional
    public List<Auto> getAuto() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Auto> cq = cb.createQuery(Auto.class);
        Root<Auto> rootEntry = cq.from(Auto.class);
        CriteriaQuery<Auto> all = cq.select(rootEntry);
        return entityManager.createQuery(all).getResultList();
    }

    @Transactional
    public Auto deleteAuto(Auto auto) {
        entityManager.remove(auto);
        entityManager.flush();
        return auto;
    }
    //  Инициализация
    public Auto initAuto() {
        Auto auto = new Auto();
        auto.setColor("wafaf");
        auto.setModel("wasfaaw");
        return auto;
    }

}
