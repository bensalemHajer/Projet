/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mahdouch
 */
public class EspritArray {
    List<Etudiant> arr ; // List<Etudiant> vect= new Vector<Etudiant>()

    public EspritArray(){
        arr = new ArrayList<Etudiant>();
    }

    public boolean ajouterEtudiant(Etudiant e) {

        return arr.add(e);
    }

    public boolean rechercherEtudiant(Etudiant e) {
        return arr.contains(e);
    }

    public boolean rechercherEtudiant(String nom) {
        for(int i=0; i<arr.size();i++)         //for(Etudiant e:vect)
        {
            if(arr.get(i).nom.equals(nom))     //if(e.getNom().equals(nom))
                return true;
        }
        return false;
    }

    public void supprimerEtudiant(Etudiant e) {
        arr.remove(e);
  }

    public void displayEtudiants() {
        for(Etudiant e:arr)
        {
            System.out.println(e);
        }
    }

    public void trierEtudiantsParId() {
        Collections.sort(arr);

    }

    public void trierEtudiantsParNom() {
        Collections.sort(arr, new TrierNom());
    }

}
