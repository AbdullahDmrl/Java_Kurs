package Gun12;

public class _05_JavaRandom {
    public static void main(String[] args) {
        // Soru : 0 ile 6 arasında random sayı üreten programı yazınız.
        // Math.random() -> 0.0000 - 0.99999 arası sayı üretir. Daima double verin

        double doubleSayi = Math.random() * 10; // 0-9 arası double sayı veriyor. 10 haric diyebiliriz
        int tamSayi = (int) doubleSayi; // 0-9 arası int sayıya dönüştü. Double oldugu icin int istersek ceviriyoruz
        System.out.println("tamSayi(0-10) = " + tamSayi);

        tamSayi = (int) (Math.random() * 6); // 0-5 arası int sayıya dönüştü
        // Burada Math.Random kismini paraenteze olmamiz lazim yoksa hep sifir verir!!!!!!!!!!!
        System.out.println("tamSayi(0-6) = " + tamSayi);
    }
}
