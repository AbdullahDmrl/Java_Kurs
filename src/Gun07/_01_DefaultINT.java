package Gun07;

public class _01_DefaultINT {
    public static void main(String[] args) {

        String kenar="40";

        short shortkenar= Short.parseShort(kenar);

        short cevre = (short) (shortkenar+shortkenar+shortkenar+shortkenar);
        // Java da tam sayılar ve tam sayı değişkenlerinin değerleri türü ne olursa olsun default INT olarak görüldüğünden
        // İşlemin sağ tarafı INT kabul edilir, dolayısıyla NARROW CASTING yapılması zorunludur.
        // Yazılımlarda BestPractics olarak tamsayılar tanımlanırken hep INT tanımlanır bu yüzden.

        System.out.println("cevre = " + cevre);
    }

}
