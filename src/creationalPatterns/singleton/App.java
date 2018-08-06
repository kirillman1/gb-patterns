package creationalPatterns.singleton;

public class App {
    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton1);
        System.out.println(enumSingleton2);
    }
}
