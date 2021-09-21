package Gun47.Ornekler.Ornek2;

public class Araba {

    private String renk;
    private String model;
    private int motor;
    private int kapiSaqyisi;

    public Araba() {
    }

    public Araba(String renk, String model, int motor, int kapiSaqyisi) {
        setRenk(renk); // this.renk = renk;
        setModel(model); //this.model = model;
        setMotor(motor); // this.motor = motor;
        setKapiSaqyisi(kapiSaqyisi); //this.kapiSaqyisi = kapiSaqyisi;

    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getKapiSaqyisi() {
        return kapiSaqyisi;
    }

    public void setKapiSaqyisi(int kapiSaqyisi) {

        if (kapiSaqyisi==2 || kapiSaqyisi==4)
        this.kapiSaqyisi = kapiSaqyisi;
        else
            System.out.println("Kapi sayisi 2 ve 4 olabilir");
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                ", kapiSaqyisi=" + kapiSaqyisi +
                '}';
    }
}
