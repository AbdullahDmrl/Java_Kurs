package Gun47.Ornekler.Ornek2;

public class ArabaMain {

    public static void main(String[] args) {

        Araba araba=new Araba();


    araba.setRenk("kirmizi"); // bos consructer atamasaydim
    araba.setModel("bmw");      //bu sekilde olusturamazdim
    araba.setMotor(1600);
    araba.setKapiSaqyisi(9);

    System.out.println("araba = " + araba);

    Araba araba2=new Araba("Mavi","mercedes",2000,9);
    System.out.println("araba2 = " + araba2);

        //to String metodu olusturdugum icin prinnt edebiliyorum. aksi halde print edemezdim



    }


}
