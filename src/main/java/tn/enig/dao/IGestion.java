package tn.enig.dao;

import tn.enig.model.Depeartement;

import java.util.List;

public interface IGestion {
    Depeartement getDepById(int id);
    List<Depeartement> getAllDep();
    Depeartement addDep(Depeartement dep);
    void deleteDep(int id);
}
