package exo_java.exo61;

public class PointNom extends Point {
    public void setPointNom(int x, int y, char nom){
        setPoint(x, y);
        this.nom=nom;
    }
    public void setNom(char nom){
        this.nom=nom;
    }
    public void affCoordNom(){
        System.out.println("Point de nom "+nom+" ");
        affCoord();
    }
    private char nom;
}