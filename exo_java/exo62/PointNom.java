package exo_java.exo62;

public class PointNom extends Point{
    public PointNom(int x, int y, char nom){
        super(x, y);
        this.nom=nom;
    }
    public void affCoordNom(){
        System.out.println("Point de nom "+nom+" ");
        affCoord();
    }
    private char nom;
}