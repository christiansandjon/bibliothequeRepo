package com.smc;



public class Roman extends Livre {

    private PrixLitteraire prixLitteraire;

    public Roman(int numeroEnregistrement, String titre, String auteur, int nbrPages, PrixLitteraire prixLitteraire) {
        super(numeroEnregistrement, titre, auteur, nbrPages);
        this.prixLitteraire = prixLitteraire;
    }

    public PrixLitteraire getPrixLitteraire() {
        return prixLitteraire;
    }

    @Override
    public String toString() {
        return "Roman{" +
                "prixLitteraire=" + prixLitteraire +
                ", auteur='" + auteur + '\'' +
                ", nbrPages=" + nbrPages +
                ", numeroEnregistrement=" + numeroEnregistrement +
                ", titre='" + titre + '\'' +
                '}';
    }
}
