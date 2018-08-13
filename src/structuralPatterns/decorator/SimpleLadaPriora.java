package structuralPatterns.decorator;

public class SimpleLadaPriora implements LadaPriora{
    @Override
    public void run() {
        System.out.println("Едет не круто");
    }

    @Override
    public void feelCool() {
        System.out.println("Водитель чувствует себя недостаточно круто");
    }
}
