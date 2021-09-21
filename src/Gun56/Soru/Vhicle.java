package Gun56.Soru;

public class Vhicle {
   private String model;
    private double engine;

    public Vhicle(String model, double engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vhicle{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
