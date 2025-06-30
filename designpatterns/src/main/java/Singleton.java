public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        /*A piece of logic marked with synchronized becomes a synchronized block, allowing only one thread to execute at any given time.
        * ( .class is used to access and synchronize static contents)
        */
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
