package Gun53.JavaPolimorfizm.Anlatim;

public class Kopek extends Hayvan{

    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Havladi");
    }
    public void kokladı() {
        System.out.println("Kokladı");
    }
}
