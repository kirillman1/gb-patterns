package structuralPatterns.decorator;

public class App {
    public static void main(String[] args) {
        LadaPriora priora = new SimpleLadaPriora();
        priora.run();
        priora.feelCool();

        priora = new LowRiderLadaPriora(priora);
        priora.run();
        priora.feelCool();
    }
}
