package exo_java.exo62;

public class TsPointC {
    public static void main(String args[]){
        PointNom pn1=new PointNom(1, 7, 'A');
        pn1.affCoordNom();        //methode de PointNom

        PointNom pn2 = new PointNom(4, 3, 'B');
        pn2.affCoordNom();         //methode de PointNom
        pn2.affCoord();           //methode de Point


        Point p=new PointNom(1, 1, 'C');


    }
}
