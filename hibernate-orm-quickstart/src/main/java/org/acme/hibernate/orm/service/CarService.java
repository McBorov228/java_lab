package org.acme.hibernate.orm.service;

import org.acme.hibernate.orm.pojo.Car;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CarService {

    @Inject
    EntityManager entityManager;

    @Transactional
    public Car insertCar(Car car) {
        entityManager.persist(car);
        entityManager.flush();
        return car;
    }

    @Transactional
    public Car updateCar(Car car) {
        entityManager.merge(car);
        entityManager.flush();
        return car;
    }

    @Transactional
    public Car deleteCar(Car car) {
        entityManager.remove(car);
        entityManager.flush();
        return car;
    }

    @Transactional
    public List<Car> getCar() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Car> cq = cb.createQuery(Car.class);
        Root<Car> rootEntry = cq.from(Car.class);
        CriteriaQuery<Car> all = cq.select(rootEntry);
        return entityManager.createQuery(all).getResultList();
    }

    public Car initCar() {
        Car car = new Car();
        car.setNumber("b123df");
        car.setType("passenger");
        return car;
    }

}
