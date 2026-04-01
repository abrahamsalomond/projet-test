class champMethodeClass {
  
    public champMethodeClass(int x){
    this.x =x;
    }
    public void affiche(){
        System.out.println("abscisse= "+(x-origine));
        System.out.println("relative a une origine d'abscisse "+origine);
    }
    public static void setOrigine(int org){ origine = org;}
    public static int getOrigine(){return origine;}  

    private int x;  //abscisse absolue du point
    private static int origine;   //abscisse absolue de l'origine courante
  public static void main(String [] args){
    champMethodeClass cmc = new champMethodeClass(3);
    champMethodeClass.setOrigine(0);
    cmc.affiche();
}
}