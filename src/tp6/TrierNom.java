/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

import java.util.Comparator;

/**
 *
 * @author Mahdouch
 */
public class TrierNom implements Comparator<Etudiant>{

    public int compare(Etudiant o1, Etudiant o2) 
    {
        return o1.getNom().compareTo(o2.getNom());
    }

}
