package Gun56.Soru;

public class ToyotaPirus extends Vhicle implements IElectric,IGas{
    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Omur boyu degistirmeden sur";
    }

    @Override
    public String changeOil() {
        return "30 lt benzille 1000 km gider";
    }

    @Override
    public String dreive() {
        return "Ilk 10 km elektrik kullanir";
    }
}
