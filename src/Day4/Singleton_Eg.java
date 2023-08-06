package Day4;

class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("Singleton instance is created");
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void toPrint(){
        System.out.println("Actual logic will be implemented");
    }

}

public class Singleton_Eg{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.toPrint();
        singleton2.toPrint();

        System.out.println(singleton1 == singleton2);

    }
}