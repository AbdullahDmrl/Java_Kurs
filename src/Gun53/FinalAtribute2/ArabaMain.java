package Gun53.FinalAtribute2;

public class ArabaMain {
    public static void main(String[] args) {
        Araba araba = new Araba("ford");

        System.out.println("araba.Model = " + araba.Model);   // araba.Model = ford

        Araba araba2 = new Araba("opel");

        System.out.println("araba2.Model = " + araba2.Model);   //araba2.Model = opel
        // araba2.Model ="honda";
        // final tipi değişkenleredeilk değer sadece
        // tanımlandığı yerde veya
        // consructor da atanabilir.
        // sonradan değiştirelemez.

        // burada consructer new ile tekrar nesne atandigi icin ikinci tanimlanabildi!!!!!!!!
    }
}




