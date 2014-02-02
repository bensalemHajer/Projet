/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Mahdouch
 */
public class Tri {
    public static void main(String[] args) {
        String s1 = new String("Ali");
        String s2 = new String("Salah");
        String s3 = new String("Farid");

         List<String> vect = new Vector<String>();

        vect.add(s1);
        vect.add(s2);
        vect.add(s3);
        
        System.out.println("Affichage avant Tri");

        for (String s : vect)
        {
            System.out.println(s);
        }

        Collections.sort(vect);
        System.out.println("Affichage apres Tri");

        for (String s : vect)
        {
            System.out.println(s);
        }
   
    }
}
