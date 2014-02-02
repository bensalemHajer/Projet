/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

/**
 *
 * @author Mahdouch
 */
public class testArray {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(0, "Farid", "Latrach");
        Etudiant e2 = new Etudiant(2, "whamed", "Radhwani");
        Etudiant e3 = new Etudiant(1, "nael", "Belhassen");

        System.out.println("--------------Ajout Etudiant-------------");

        EspritArray ar = new EspritArray();
        System.out.println(ar.ajouterEtudiant(e1));
        System.out.println(ar.ajouterEtudiant(e2));
        System.out.println(ar.ajouterEtudiant(e3));

        System.out.println("------------Trier Etudiant ID------------");
        ar.trierEtudiantsParId();
        ar.displayEtudiants();
        System.out.println("-----------Trier Etudiant Nom------------");
        ar.trierEtudiantsParNom();
        ar.displayEtudiants();
    }

}
