package exo_java.exo60;

public class TsPointA {
    public static void main(String [] args){
        Point p = new Point();
        p.initialise(2, 5);
        System.out.println("Coordonnees: "+p.getX()+ " "+p.getY());
        PointA pa = new PointA();
        pa.initialise(1, 8);
        pa.affiche();
    }
    
}
