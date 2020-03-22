package com.smc;

public class Manuel extends Livre {

    private int niveauScolaire;

    public Manuel(int numeroEnregistrement, String titre, String auteur, int nbrPages, int niveauScolaire) {
        super(numeroEnregistrement, titre, auteur, nbrPages);
        this.niveauScolaire = niveauScolaire;
    }

    public int getNiveauScolaire() {
        return niveauScolaire;
    }

    @Override
    public String toString() {
        return "Manuel{" +
                "niveauScolaire=" + niveauScolaire +
                ", auteur='" + auteur + '\'' +
                ", nbrPages=" + nbrPages +
                ", numeroEnregistrement=" + numeroEnregistrement +
                ", titre='" + titre + '\'' +
                '}';
    }
}
