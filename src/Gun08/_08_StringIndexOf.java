package Gun08;

public class _08_StringIndexOf {
    public static void main(String[] args) {
        // Verilen karakter(lerin) stringin içindeki INDEX nosunuz verir.
        // contains bize var veya yok diyordu, bu ise INDEX ini verir, yok ise -1 verir
        // aynı karakterden fazla olursa ilkinin INDEX ini verir
                 //0123456789012
        String s1="Merhaba Dünya";
        System.out.println("s1.indexOf(e) = " + s1.indexOf("e"));

        System.out.println("s1.indexOf(e) = " + s1.indexOf("e"));
        System.out.println("s1.indexOf(ha) = " + s1.indexOf("ha"));
        System.out.println("s1.indexOf(ny) = " + s1.indexOf("ny"));
        System.out.println("s1.indexOf( ) = " + s1.indexOf(" "));
        System.out.println("s1.indexOf(k) = " + s1.indexOf("k"));
        System.out.println("s1.indexOf(a) = " + s1.indexOf("a"));
        System.out.println("s1.indexOf(A) = " + s1.indexOf("A"));
    }
}
