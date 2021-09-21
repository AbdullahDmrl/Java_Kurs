package Gun06;

public class _01_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> char -> int -> long -> float -> double ; otomatik dönüşüm

        int sayi=9;
        double oran = 3.2;

        oran = sayi; // int tipindeki 9 değeri double türündeki alana atıldı.
        // bu tip dönüşümüne genişletilme yönünde olduğundan Widening Casting denir.
        // diğer adıyla herhangi bir extra işlem yapmadığımız için automatic dönüşüm de denir.

        System.out.println("oran = " + oran); // oran = 9 , kayıp olmadı
    }
}
