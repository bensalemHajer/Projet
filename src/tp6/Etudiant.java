/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

/**
 *
 * @author Mahdouch
 */
public class Etudiant implements Comparable<Etudiant>{
    public int id;
    public String nom;
    public String prenom;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id +" "+ "nom=" + nom +" "+ "prenom=" + prenom + '}';
    }

    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(obj.getClass()!=this.getClass())
            return false;
        Etudiant e = (Etudiant)obj;
        if(id==e.getId()&&nom.equals(e.getNom())&&prenom.equals(e.getPrenom()))
            return true;
        return false;
    }

     public int compareTo(Etudiant o) {
        if(id<o.getId())
            return -1;
        if(id>o.getId())
            return 1;
        else
            return 0;
    }
}
