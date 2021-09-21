package Gun04;

public class _03_EscapeCharacter {
    public static void main(String[] args) {
        // EscapeCharacter
        // \n -> yeni satır açıyor
        // \t -> tab tuşuna basılmış gibi etki yapar,
        //       yani bir TAB tuşuna basılmış kadar boşluk bırakır
        // \b -> BackSpace basılmış gibi bir karakter geri siler.
        // \" -> Çift tırnak koyar
        // \\ -> \ işareti koyar
        // \r -> Satır başına kadar olan karakterleri siler

        System.out.println("Merhaba Dünya"); // Merhaba Dünya
        System.out.println("Merhaba \n Dünya"); // altsatıra geçer
        System.out.println("Merhaba \t Dünya"); // 1 TAB lık boşıl bırakır Merhaba 	 Dünya
        System.out.println("Merhaba\bDünya\b"); // 1 karakter geriye doğru siler BackSpace   MerhabDüny
        System.out.println("Merhaba\"Dünya"); // başına \ konulan özel karakterler direk yazdırılabilir.Merhaba"Dünya
        System.out.println("Merhaba\\Dünya"); // başına \ konulan özel karakterler direk yazdırılabilir.Merhaba\Dünya
        System.out.println("Merhaba\rDünya"); // Satır başına kadar olan karakterleri sildi. Dünya
        System.out.println("Merhaba \"Dünya\" "); //Merhaba "Dünya"

    }
}
