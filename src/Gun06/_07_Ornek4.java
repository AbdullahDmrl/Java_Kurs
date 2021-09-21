package Gun06;

public class _07_Ornek4 {
    public static void main(String[] args) {
        // Soru : Short olarak atadığınız değeri stringe çevirerek,
        // ekrana yazdırınız.

        short sayi = 345;
        String strSayi = Short.toString(sayi);

        System.out.println("strSayi = " + strSayi);
        System.out.println("Short.toString(sayi) = " + Short.toString(sayi));
    }
}
