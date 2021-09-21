package Gun09;

public class _08_StringReplaceFirst {
    public static void main(String[] args) {
        // ReplaceFirst : Replace ile aynı , sadece ilk bulunanı değiştiriyor.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("bütün a lar değişti -> _ = " + text.replace("a","_"));
        // Merh_b_ Düny_

        System.out.println("ilk a değişti -> _ = " + text.replaceFirst("a","_"));
        // Merh_ba Dünya
    }
}
