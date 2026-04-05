package exo_java.exo61;

public class Point {
    public void setPoint(int x, int y){
        this.x=x; this.y=y;
    }
    public void deplace(int dx, int dy){ x+=dx; y+=dy; }
    public void affCoord(){
        System.out.println("Coordonnees:x= "+x+" et y="+y);
    }
    private int x, y;

}
