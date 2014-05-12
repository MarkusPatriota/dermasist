package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.entities.Scheduling;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Markus
 */
@Stateless
public class SchedulingDao extends DaoAbstract<Scheduling> {
    @PersistenceContext(unitName = "dermasist_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SchedulingDao() {
        super(Scheduling.class);
    }
    
}