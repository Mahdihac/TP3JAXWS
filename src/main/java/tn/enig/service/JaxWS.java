package tn.enig.service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import tn.enig.dao.GestionImp;
import tn.enig.dao.IGestion;
import tn.enig.model.Depeartement;

import java.util.List;

@WebService(serviceName = "Jax-WS")
public class JaxWS {
    GestionImp imp;


    @WebMethod
    public Depeartement getDepById(@WebParam(name = "id") int id) throws ClassNotFoundException {
        imp = new GestionImp();
        return imp.getDepById(id);}
    @WebMethod
    public List<Depeartement> getAllDep() throws ClassNotFoundException {
        imp = new GestionImp();
        return imp.getAllDep();}
    @WebMethod
    public Depeartement addDep(Depeartement dep) throws ClassNotFoundException {
        imp = new GestionImp();
        return imp.addDep(dep);
    }
    @WebMethod
    public void deleteDep(@WebParam(name = "id") int id) throws ClassNotFoundException {
        imp = new GestionImp();
    }
}
