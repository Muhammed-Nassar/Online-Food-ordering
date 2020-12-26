/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

//import static com.aklny.dal.DBConnectionManager.getCurrentSession;
import com.aklny.dal.repo.impl.CommonRepo;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author 4G
 */
public abstract class AbstractEntityRepo<E> implements CommonRepo<E> {

    @Autowired
    private SessionFactory sessionFactory;
    private Class<E> entityType;

    public AbstractEntityRepo(Class<E> entityType) {
        this.entityType = entityType;
    }

    @Override
    public E add(E entity) {
        getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public E update(E entity) {

        return (E) getCurrentSession().merge(entity);
    }

    @Override
    public void remove(Integer id) {

        E foundedEntity = (E) getCurrentSession().load(entityType, id);
        getCurrentSession().delete(foundedEntity);
    }

    @Override
    public E findById(Integer id) {
        return (E) getCurrentSession().get(entityType, id);
    }

    @Override
    public List<E> findList() {
        CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<E> criteriaQuery = builder.createQuery(entityType);
        Root<E> root = criteriaQuery.from(entityType);
        criteriaQuery.select(root);
        Query<E> query = getCurrentSession().createQuery(criteriaQuery);
        List<E> resultList = query.getResultList();
        return resultList;
    }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
