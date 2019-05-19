package criacao.singleton;

public final class Desktop {
   
    private static class Desk {
        static final Desktop des = new Desktop();
    }

    public static Desktop getDesktop() {
        return Desk.des;
    }
    
    
    
    
    
    
  


}
