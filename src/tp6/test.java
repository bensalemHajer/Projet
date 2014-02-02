/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

/**
 *
 * @author Mahdouch
 */
public class test {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(0, "Farid", "Latrach");
        Etudiant e2 = new Etudiant(2, "Mhamed", "Radhwani");
        Etudiant e3 = new Etudiant(1, "Wael", "Belhassen");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println("-----------------Equals------------------");
        System.out.println(e2.equals(e3));
        System.out.println("--------------Ajout Etudiant-------------");

        EspritVector ev = new EspritVector();
        System.out.println(ev.ajouterEtudiant(e1));
        System.out.println(ev.ajouterEtudiant(e2));
        System.out.println(ev.ajouterEtudiant(e3));

        System.out.println(ev.rechercherEtudiant(e2));
        System.out.println("-----------Recherche Etudiant------------");
        ev.displayEtudiants();
        System.out.println("--------------Suppression----------------");
        ev.supprimerEtudiant(e3);
        System.out.println(ev.rechercherEtudiant(e3));

        System.out.println(ev.ajouterEtudiant(e3));
        System.out.println("------------Trier Etudiant ID------------");
        ev.trierEtudiantsParId();
        ev.displayEtudiants();
        System.out.println("-----------Trier Etudiant Nom------------");
        ev.trierEtudiantsParNom();
        ev.displayEtudiants();
    }

}
