class Singleton {

    private static Singleton instance;

    private Singleton(){ } // private constructor to prevent instantiation

    public static Singleton getInstance( ) {
        if( instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}