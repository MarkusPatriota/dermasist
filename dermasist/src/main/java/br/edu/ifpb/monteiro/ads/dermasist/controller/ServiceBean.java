package br.edu.ifpb.monteiro.ads.dermasist.controller;

import br.edu.ifpb.monteiro.ads.dermasist.exceptions.DermaSistException;
import br.edu.ifpb.monteiro.ads.dermasist.services.ServiceService;
import br.edu.ifpb.monteiro.ads.dermasist.model.Service;
import br.edu.ifpb.monteiro.ads.dermasist.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * Controller to manage the communication between the page and the rest of
 * project
 *
 * @author cassio
 */
@Model
public class ServiceBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ServiceService serviceService;

    //A list to storage the data come from database
    private List<Service> services;
    private Service service;
    private Service selectService;

    public ServiceBean() {

    }

    @PostConstruct
    public void init() {
        service = new Service();
        selectService = new Service();
        
    }

    private void clean() {

    }

    public void create() {
        try {
            this.serviceService.create(service);
            FacesUtil.addSuccessMessage("Serviço cadastrado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }


     public void update() {
        try {
            this.serviceService.update(selectService);
            FacesUtil.addSuccessMessage("Serviço editado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }

    public void delete() {
        try {
            this.serviceService.delete(selectService);
            FacesUtil.addSuccessMessage("Serviço deletado com sucesso!");
        } catch (DermaSistException e) {
            FacesUtil.addSuccessMessage(e.getMessage());
        }
    }
    
    
    /**
     * @return the service
     */
    public Service getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(Service service) {
        this.service = service;
    }

    public List<Service> getServices() {
        services = serviceService.findAll();
        return services;
    }

    public Service getSelectService() {
        return selectService;
    }

    public void setSelectService(Service selectService) {
        this.selectService = selectService;
    }

}
