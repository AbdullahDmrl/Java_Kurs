package Gun08;

public class _02_StringCharAt {
    public static void main(String[] args) {
        // İstenen noktadaki karakteri verir.
        // Karakterlerin sırası 0 (Sıfır) dan başlar bun index denir.
                     //0123456789012
        String kelime="Merhaba Dünya";

        System.out.println("3.Harf = " + kelime.charAt(2) );
        
        char ilkHarf = kelime.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);
    }
}
