package tn.enig.model;

public class Depeartement {
    private int id;
    private String titre;
    private int nbGrp;
    private int anneeC;

    public Depeartement() {
    }

    public Depeartement(int id, String titre, int nbGrp, int anneeC) {
        this.id = id;
        this.titre = titre;
        this.nbGrp = nbGrp;
        this.anneeC = anneeC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbGrp() {
        return nbGrp;
    }

    public void setNbGrp(int nbGrp) {
        this.nbGrp = nbGrp;
    }

    public int getAnneeC() {
        return anneeC;
    }

    public void setAnneeC(int anneeC) {
        this.anneeC = anneeC;
    }

    @Override
    public String toString() {
        return "Depeartement{" +
                "Id=" + id +
                ", Titre='" + titre + '\'' +
                ", nb Groupe=" + nbGrp +
                ", annee de Creation=" + anneeC +
                '}';
    }
}
