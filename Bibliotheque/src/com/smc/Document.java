package com.smc;

public abstract class Document {

    protected int numeroEnregistrement;
    protected String titre;

    public Document(int numeroEnregistrement, String titre) {
        this.numeroEnregistrement = numeroEnregistrement;
        this.titre = titre;
    }

    public int getNumeroEnregistrement() {
        return numeroEnregistrement;
    }

    public String getTitre() {
        return titre;
    }

}
