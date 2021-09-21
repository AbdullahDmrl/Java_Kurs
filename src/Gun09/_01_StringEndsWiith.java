package Gun09;

public class _01_StringEndsWiith {
    public static void main(String[] args) {
        // endsWith : ... ile bitiyor mu ? Sonuç boolean

        String text="Merhaba Dünya";

        System.out.println("ya ile bitiyor mu? = " + text.endsWith("ya")); // true
        System.out.println("a ile bitiyor mu? = " + text.endsWith("a")); // true
        System.out.println("A ile bitiyor mu? = " + text.endsWith("A")); // false
        System.out.println("y ile bitiyor mu? = " + text.endsWith("y")); // false
        System.out.println("ba ile bitiyor mu? = " + text.endsWith("ba")); // false
    }
}
