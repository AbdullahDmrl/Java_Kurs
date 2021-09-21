package Gun05;

public class _03_Ornek1 {
    public static void main(String[] args) {  // başla
        // Bir dikdortgenin kısa ve uzun kenarı için 2 değişken tanımlayınız
        // 10 ve 15 değerleri atayınız. Çevresini ve alanını yazdırınız.
        // ctrl+Alt+L reFormat

        int kisaKenar = 10;  // algoritmadaki dikdörtgen
        int uzunKenar = 15; // algoritmadaki dikdörtgen

        int cevre = kisaKenar + kisaKenar + uzunKenar + uzunKenar; // algoritmadaki dikdörtgen
        int alan = kisaKenar * uzunKenar; // algoritmadaki dikdörtgen

        System.out.println("cevre = " + cevre + " cm"); // algoritmadaki yazdırma
        System.out.println("alan = " + alan + " dır"); // algoritmadaki yazdırma
    } // DUR
}
