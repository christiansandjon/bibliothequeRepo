package com.smc;

public class TestDocuments {

    public static void main(String[] args) {

        Document roman = new Roman(1,"tintin","hergé",50,PrixLitteraire.GONCOURT);
        Document manuel = new Manuel(2,"CQFD","chris",200,5);
        Document revue = new Revue(3,"presse",7,2019);
        Document dictionnaire = new Dictionnaire(4,"Larousse",Langue.FRANCAIS);


        System.out.println("j'ajoute des documents dans ma bibliotheque ");
        Bibliotheque bibliotheque = new Bibliotheque(5);
        bibliotheque.ajouterDocument(roman);
        bibliotheque.ajouterDocument(manuel);
        bibliotheque.ajouterDocument(revue);
        bibliotheque.ajouterDocument(dictionnaire);

        System.out.println("nombre total de documents");
        bibliotheque.getNbDocs();

        System.out.println("je cherche le 3e document de ma bibi");
        bibliotheque.getDocumentIndex(2);

        System.out.println("jaffiche ma liste de documents");
        bibliotheque.afficher();

        System.out.println("je supprime le document manuel");
        bibliotheque.deleteDoc(manuel);

        System.out.println("jaffiche ma liste de documents");
        bibliotheque.afficher();
    }
}
