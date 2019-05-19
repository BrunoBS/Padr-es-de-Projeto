package criacao.singleton;

public final class Banco {

    private static volatile Banco instance;

    private Banco() {
    }
 
    public static Banco getInstance() {
        if (instance == null) {
            synchronized (Banco.class) {
                if (instance == null) {
                    instance = new Banco();
                }
            }
        }
        return instance;
    }

}
