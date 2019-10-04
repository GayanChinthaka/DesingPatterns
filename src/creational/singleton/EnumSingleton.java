package creational.singleton;

public enum EnumSingleton {

    INSTANCE;
    
    public static void doSomething(){
        System.out.println("enum singleton");
    }
}