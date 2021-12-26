package org.acme.hibernate.orm.service;

import org.acme.hibernate.orm.pojo.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    EntityManager entityManager;

    @Transactional
    public User insertUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
        return user;
    }

    @Transactional
    public User updateUser(User user) {
        entityManager.merge(user);
        entityManager.flush();
        return user;
    }

    @Transactional
    public List<User> getUser() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> rootEntry = cq.from(User.class);
        CriteriaQuery<User> all = cq.select(rootEntry);
        return entityManager.createQuery(all).getResultList();
    }

    @Transactional
    public User deleteUser(User user) {
        entityManager.remove(user);
        entityManager.flush();
        return user;
    }

    public User initUser() {
        User user = new User();
        user.setAge(12);
        user.setName("awsfaf");
        return user;
    }

}
