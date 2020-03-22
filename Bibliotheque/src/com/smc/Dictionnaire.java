package com.smc;

public class Dictionnaire extends Document{

    private Langue langue;

    public Dictionnaire(int numeroEnregistrement, String titre, Langue langue) {
        super(numeroEnregistrement, titre);
        this.langue = langue;
    }

    public Langue getLangue() {
        return langue;
    }

    @Override
    public String toString() {
        return "Dictionnaire{" +
                "langue=" + langue +
                ", numeroEnregistrement=" + numeroEnregistrement +
                ", titre='" + titre + '\'' +
                '}';
    }
}
