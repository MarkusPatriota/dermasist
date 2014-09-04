package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.ServiceDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Service;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class ServiceDao extends  AbstractDAO<Service> implements ServiceDaoIF{
    
    
    public ServiceDao(){
        super(Service.class);
    }
   
}
