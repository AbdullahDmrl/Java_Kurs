package Gun23;

public class _06_javaMethod {
    public static void main(String[] args) {
        ortalamaBulYaz("Ali", 60, 80, 85, 95, 100, 60);
        ortalamaBulYaz("Mehmet", 60, 75, 55, 90);
        ortalamaBulYaz("Ayşe", 65, 70, 75);
        ortalamaBulYaz("Ömer", 60, 80, 85, 95, 60);

        ortalamaBulYaz(44, 60, 80, 85, 95, 60);
    }

    // ... ile ilgili 2 kural var
    // 1- Bir metodda parametre olarak sadece 1 tane olabilir. ....sadece bir tane olabilir
    // 2- Her zaman son parametre olmalı
    public static void ortalamaBulYaz(String isim, int... notlar) {
        int toplam = 0;

        for (int not : notlar) {
            toplam += not;
        }

        System.out.println(isim + " = " + toplam / notlar.length);
    }

    public static void ortalamaBulYaz(int yas, int... notlar) {

        int toplam = 0;

        for (int not : notlar) {
            toplam += not;
        }
        System.out.println(yas + "ortalama="+ toplam / notlar.length); // burada yas ortalama yazmazsak dahil ediyor
    }
}
