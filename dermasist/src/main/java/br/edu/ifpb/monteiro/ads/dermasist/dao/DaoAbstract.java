package br.edu.ifpb.monteiro.ads.dermasist.dao;

import java.util.List;
import javax.persistence.EntityManager;

/**
 * Abstract class for persisting data with the database, which contains methods to persist,
 * delete, update, Search by id, search all, multiple search and counting.
 * 
 * @author Markus
 * @param <T>
 */
public abstract class DaoAbstract<T> {
    private Class<T> entityClass;

    /**
     * O construtor da classe recebe com paramento a entitate que vai ser 
     * persistida no banco de dados.
     * @param entityClass 
     */
    public DaoAbstract(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    /**
     * Método abstrator para recuperar o EntityManager 
     * @return 
     */
    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}
