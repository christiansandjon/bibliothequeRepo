package com.smc;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    public static int cpt=0;
    private int capacite;
    private List<Document> documents;

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        documents = new ArrayList<>();
    }

    public void ajouterDocument(Document document){
        documents.add(document);
        cpt++;
    }

    public void deleteDoc(Document document) {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.contains(document)) {
                documents.remove(document);
            }
        }
    }

    public void getNbDocs(){
        System.out.println(cpt);
    }
    public void getDocumentIndex(int i){
        for (Document document : documents){
            document = documents.get(i);
        }
        System.out.println(documents.get(i).getTitre());
    }

    public void afficher() {
        for (Document document : documents){
            if (document instanceof Roman){
                Roman roman = (Roman) document;
                System.out.println(
                 roman.titre+" "+ roman.auteur+" "+
                 roman.nbrPages+" "+roman.getPrixLitteraire()
                );
            } else if (document instanceof Manuel){
                Manuel manuel = (Manuel) document;
                System.out.println(
                        manuel.titre+" "+ manuel.auteur+" "+
                                manuel.nbrPages+" "+manuel.getNiveauScolaire()
                );
            } else if (document instanceof Revue){
                Revue revue = (Revue) document;
                System.out.println(
                        revue.titre+" "+ revue.getMois()+" "+revue.getAnnee()
                );
            } else if (document instanceof Dictionnaire){
                Dictionnaire dictionnaire = (Dictionnaire) document;
                System.out.println(
                        dictionnaire.titre+" "+ dictionnaire.getLangue()
                );
            }
        }
    }
}
