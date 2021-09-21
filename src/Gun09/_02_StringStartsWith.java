package Gun09;

public class _02_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith : Bir stringin verilen string ile başlayıp başlamadığının
        // sonucunu boolean olark döner.

        String text="Merhaba Dünya";

        System.out.println("ME ile başlıyor mu ? = " + text.startsWith("ME")); // false
        System.out.println("Me ile başlıyor mu ? = " + text.startsWith("Me")); // true
        System.out.println("M ile başlıyor mu ? = " + text.startsWith("M")); // true
        System.out.println("k ile başlıyor mu ? = " + text.startsWith("k")); // false
    }
}
