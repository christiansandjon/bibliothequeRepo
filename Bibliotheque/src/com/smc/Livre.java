package com.smc;

public abstract class Livre extends Document{

    protected String auteur;
    protected int nbrPages;

    public Livre(int numeroEnregistrement, String titre, String auteur, int nbrPages) {
        super(numeroEnregistrement, titre);
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbrPages() {
        return nbrPages;
    }
}
