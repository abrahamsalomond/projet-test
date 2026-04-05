package exo_java.exo61;
public class TsPointN {
    public static void main(String [] args){
        Point p=new Point();
        p.setPoint(2, 5);
        p.affCoord();
        PointNom pn1=new PointNom();
        pn1.setPointNom(1, 7, 'A');  //methode de PointNom
        pn1.affCoordNom();                    //methode de PointNom
        pn1.deplace(9, 3);            //methode de Point
        pn1.affCoordNom();                  //methode de PointNom

        PointNom pn2=new PointNom();
        pn2.setPoint(4, 3);             //methode de Point
        pn2.setNom('B');                //methode de PointNom
        pn2.affCoordNom();                  //methode de PointNom
        pn2.affCoord();                     //methode de Point
    }
    
}