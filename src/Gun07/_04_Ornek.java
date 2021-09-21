package Gun07;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız.
        Scanner oku=new Scanner(System.in); // okuyucuyu bi kere tanımlamaız gerekiyor.

        System.out.print("Adınız ve Soyadınız = "); // ekrana gelen veri girişinin ne için olduğunu
        // kullanıcıya belirtmek için zorunlu değil.
        String adSoyad= oku.nextLine(); // okuma işi bu noktada yapılıyor. bizde okunan değeri değişkene eşitliyoruz

        System.out.println("adSoyad = " + adSoyad); // okunan değer doğru mu okundu diye ekrana yazdırıyoruz.
    }
}
