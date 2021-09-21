package Gun53.FinalAtribute;

public class ArabaMain {
    public static void main(String[] args) {
        Araba araba=new Araba("en yeni model");

        System.out.println("araba.model = " + araba.model);


        // final oldugu ve super class da tanimlandigi icin degistirilemez
        // Dolayisiyla; cikti   araba.model = Ford Galaxy olur

    }

}
