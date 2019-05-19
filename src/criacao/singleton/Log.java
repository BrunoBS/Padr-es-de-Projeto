package criacao.singleton;

public final class Log {

    private static final Log log = new Log();

    public static Log getResource() {
        return log;
    }

    private Log() {
    }

}
