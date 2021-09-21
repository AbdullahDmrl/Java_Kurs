package Gun07;

import java.util.Scanner;

public class _08_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan kaç bilet istediğini(byte) ve sigorta isteyip istemedğini (boolean olarak)
        // alıp ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Kaç bilet istiyorsunuz="); byte biletSayisi=oku.nextByte();
        System.out.print("Sigorta istiyormusunuz="); boolean isSigorta=oku.nextBoolean();

        System.out.println("Bilet sayısı = " +biletSayisi + ", Sigortali mi = "+ isSigorta);
    }
}
