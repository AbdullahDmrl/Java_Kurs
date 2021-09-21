package Gun09;

public class _06_StringReplace {
    public static void main(String[] args) {
        // Replace : bir stringin içerisindeki istenen karakter(lerin) hepsini,
        // verilen yenisi ile değiştirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali= " + text);
        System.out.println("a ların e olarak deişmiş hali = " + text.replace("a", "e")); //Merhebe Dünye
        System.out.println("ba -> de = " + text.replace("ba", "de")); //Merhade Dünya
        System.out.println("Dünya -> Java = " + text.replace("Dünya", "Java")); //Merhaba Java
        System.out.println("a ların silebilirsiniz = " + text.replace("a", "")); //Merhb Düny
    }
}
