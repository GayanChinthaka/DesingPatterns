
package creational.singleton.eager;

public class singleton_eager {
    
    private static final singleton_eager instance = new singleton_eager();
    
    private singleton_eager(){}

    public static singleton_eager getInstance(){
        return instance;
        
    }
}
