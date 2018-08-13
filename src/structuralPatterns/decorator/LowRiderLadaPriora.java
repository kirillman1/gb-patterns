package structuralPatterns.decorator;

public class LowRiderLadaPriora implements LadaPriora{

    private LadaPriora decorated;

    public LowRiderLadaPriora(LadaPriora decorated) {
        this.decorated = decorated;
    }

    @Override
    public void run() {
        System.out.println("Едет по-прежнему не круто");
    }

    @Override
    public void feelCool() {
        System.out.println("Водитель чувствует себя гораздо круче");
    }
}
