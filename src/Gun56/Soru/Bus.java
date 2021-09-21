package Gun56.Soru;

public class Bus extends Vhicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo ile 1000 km gidebilirsin";
    }

    @Override
    public String dreive() {
        return "Güvenli surusler";
    }
}
