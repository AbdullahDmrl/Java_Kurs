package Gun08;

public class _10_StringLastIndexOf {
    public static void main(String[] args) {
        // indexOf la aynı şekilde çalışır, sadece sondan itibaren
        // ilk bulduğunun INDEX ini verir.
                 //0123456 index sırası hep aynı
        String s1="Merhaba";

        System.out.println("Baştan a nın INDEX i = " + s1.indexOf("a")); // 4
        System.out.println("Sondan a nın INDEX i = " + s1.lastIndexOf("a")); // 6

                 //01234 index sırası hep aynı
        String s2="Good";
        System.out.println("Baştan o harfi nin INDEX = " + s2.indexOf("o")); //1
        System.out.println("Sondan o harfi nin INDEX = " + s2.lastIndexOf("o")); //2
    }
}
