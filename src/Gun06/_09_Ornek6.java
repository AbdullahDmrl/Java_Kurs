package Gun06;

public class _09_Ornek6 {
    public static void main(String[] args) {
        // String olarak verilen karenin 1 kenar uzunluğundan
        // karenin çevresinin uzunluğunu bulunuz.

        String kenar="8";

        int intKenar= Integer.parseInt(kenar);

        int cevre = intKenar + intKenar + intKenar +intKenar ;

        System.out.println("cevre = " + cevre);
    }
}
