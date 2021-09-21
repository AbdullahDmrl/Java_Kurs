package Gun56.Soru;

public class TeslaCar extends Vhicle implements IElectric{
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "10 yilda bir batarya yi degistir";
    }

    @Override
    public String dreive() {
        return "Auto pilotu guvenle kullanabilirsin";
    }
}
