package com.smc;

public class Revue extends Document {

    private int mois;
    private int annee;

    public Revue(int numeroEnregistrement, String titre, int mois, int annee) {
        super(numeroEnregistrement, titre);
        this.mois = mois;
        this.annee = annee;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public String toString() {
        return "Revue{" +
                "annee=" + annee +
                ", numeroEnregistrement=" + numeroEnregistrement +
                ", titre='" + titre + '\'' +
                '}';
    }
}
