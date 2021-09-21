package Gun06;

public class _06_StringSayıÇev {
    public static void main(String[] args) {

        String girilenKelime = "65"; // şu haliyle ahmet gibi bir kelimedir.sayısal işleme giremez
        int girilenSayi=65;

        // kelimenin -> sayıya çevrilmesi

        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime); // dönüşecek tipe uygun dönüşüm
        short shortDeger = Short.parseShort(girilenKelime);
        double oran = Double.parseDouble(girilenKelime);

        String str = "5";
        String str2 = "4.3";

        int a = Integer.parseInt(str);
        double b = Double.parseDouble(str2);

        System.out.println(a + " " + b);
        System.out.println(a + b);
        //Çıktı
        // 5 4.3
        // 9.3





    }
}
