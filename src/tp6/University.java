/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

/**
 *
 * @author Mahdouch
 */
public interface University {
    public boolean ajouterEtudiant(Etudiant e);
    public boolean rechercherEtudiant(Etudiant e);
    public boolean rechercherEtudiant(String nom);
    public void supprimerEtudiant(Etudiant e);
    public void displayEtudiants();
    public void trierEtudiantsParId();
    public void trierEtudiantsParNom();
}
