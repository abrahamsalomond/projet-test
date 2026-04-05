class ChampMethodeClass2 {
   private static int numCour = 0;
   private int num;

   public ChampMethodeClass2() {
      ++numCour;
      this.num = numCour;
   }

   public int getIdent() {
      return num;
   }

   public static int getIdentMax() {
      return numCour;
   }

   public static void main(String[] args) {
      ChampMethodeClass2 cmc1 = new ChampMethodeClass2();
      ChampMethodeClass2 cmc12 = new ChampMethodeClass2();
      System.out.println("Numero de cmc1 : " + cmc1.getIdent());
      System.out.println("Numero de cmc12 : " + cmc12.getIdent());
      System.out.println("Le dernier numero est " + getIdentMax());
      ChampMethodeClass2 c = new ChampMethodeClass2();
      System.out.println("Le dernier numero est " + ChampMethodeClass2.getIdentMax());
   }
}