package creationalPatterns.builder;

public class App {
    public static void main(String[] args) {
        Contact vasyaPupkin = new Contact.Builder("Vasya","Pupkin")
                .setAge(43)
                .setMiddleName("Ivanovich")
                .setCity("Moscow")
                .build();
    }
}
