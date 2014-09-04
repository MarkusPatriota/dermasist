package br.edu.ifpb.monteiro.ads.dermasist.dao;

import br.edu.ifpb.monteiro.ads.dermasist.interfacesdao.PatrimonyDaoIF;
import br.edu.ifpb.monteiro.ads.dermasist.model.Patrimony;

/**
 *
 * @author Wilde Arruda, modifield by Vanderlan Gomes
 */
public class PatrimonyDao extends AbstractDAO<Patrimony> implements PatrimonyDaoIF{

    public PatrimonyDao() {
        super(Patrimony.class);
    }
    
}
