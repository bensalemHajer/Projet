/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Mahdouch
 */
public class EspritVector implements University {

    List<Etudiant> vect ; // List<Etudiant> vect= new Vector<Etudiant>()
    
    public EspritVector(){
        vect = new Vector<Etudiant>();
    }

             public boolean ajouterEtudiant(Etudiant e) {

        return vect.add(e);
    }

    public boolean rechercherEtudiant(Etudiant e) {
        return vect.contains(e);
    }

    public boolean rechercherEtudiant(String nom) {
        for(int i=0; i<vect.size();i++)         //for(Etudiant e:vect)
        {
            if(vect.get(i).nom.equals(nom))     //if(e.getNom().equals(nom))
                return true;
        }
        return false;
    }

    public void supprimerEtudiant(Etudiant e) {
        vect.remove(e);
    }

    public void displayEtudiants() {
        for(Etudiant e:vect)
        {
            System.out.println(e);
        }
    }

    public void trierEtudiantsParId() {
       Collections.sort(vect);
       

    }

    public void trierEtudiantsParNom()
    {
        Collections.sort(vect, new TrierNom());
    }

}
