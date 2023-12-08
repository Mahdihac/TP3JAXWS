package tn.enig.dao;

import tn.enig.model.Depeartement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestionImp implements IGestion {
    Connection con;
    public GestionImp() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp3jaxws", "root", "");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Depeartement getDepById(int id) {
        Depeartement dep = null;
        String q="select d from departement where id=?1";
        try {
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1,id);
            ResultSet res=st.executeQuery();
            dep=new Depeartement(res.getInt(1),res.getString(2),res.getInt(3),res.getInt(4));

        }catch (SQLException e){
            e.printStackTrace();
        }
        return dep;
    }

    @Override
    public List<Depeartement> getAllDep() {
        String q="select * from departement";
        List<Depeartement> deps= new ArrayList<Depeartement>();;
        try {
            PreparedStatement st = con.prepareStatement(q);
            ResultSet res=st.executeQuery();
            while(res.next()) {
                Depeartement p = new Depeartement(res.getInt(1),res.getString(2),res.getInt(3), res.getInt(4));
                deps.add(p);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return deps;
    }

    @Override
    public Depeartement addDep(Depeartement dep) {
        String q="insert into departement(titre,nbGrp,anneeC) values(?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(q);
            st.setString(1, dep.getTitre());
            st.setInt(2, dep.getNbGrp());
            st.setInt(3, dep.getAnneeC());
            st.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return dep;
    }
    @Override
    public void deleteDep(int id) {
        String q="delete from departement where id=?1";
        try{
            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1,id);
            st.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
