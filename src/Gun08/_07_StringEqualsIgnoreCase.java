package Gun08;

public class _07_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        // 2 stringi büyük küçük harf ayırımı yapmadan karşılaştırır.
        // sonuç boolean dur.

        String s1="Merhaba";
        String s2="MERHABA";

        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase("MerHABA"));
    }
}
