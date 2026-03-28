import java.util.*;
public class Ens1 {
    public static void main(String [] args){
        int t[] = {2, 5, -6, 2, -8, 9, 5};
        HashSet<Integer> ens = new HashSet<>();
        //On ajoute des element de type Integer
        for(int i=0; i<t.length; i++){
            boolean ajoute = ens.add(t[i]);
            if(ajoute) System.out.println("On ajoute "+ t[i]);
            else System.out.println(" "+t[i]+ " est deja present");
        }
        System.out.println("Ensemble en A= "+ens);
        //affiche(ens);
        //On supprime un eventuel objet de valeur Integer(5)
       // Integer cinq = new Integer(5);
       //System.out.println();
    }
    public static void affiche(HashSet ens){
        Iterator iter = ens.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next()+" ");
        }
       }
}
