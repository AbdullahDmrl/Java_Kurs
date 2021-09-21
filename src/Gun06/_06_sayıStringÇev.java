package Gun06;

public class _06_sayıStringÇev {
    public static void main(String[] args) {

        String girilenKelime = "65"; // şu haliyle ahmet gibi bir kelimedir.sayısal işleme giremez
        int girilenSayi=65;
       double oran=3.2;

        // sayinin -> kelimeye çevrilmesi

        String girilenSayininKelimeHali = Integer.toString(girilenSayi); // değişkenin tipine uygun dönüşüm
        String kelimeOran = Double.toString(oran);



        // Sayısal değerleri, string tipine dönüştürmek için Java birkaç farklı yöntem sunar.
        // Bunlardan ilki, işi Java derleyicisine bırakmak.
        // 1:
        String str = "" + 5;
        System.out.println(str);

        // 2: String sınıfının sunmuş olduğu valueOf() methodunu çağırarak
        float fl = (float) 5.2;
        String str1 = String.valueOf(fl);

        // 3:
        int a = 5;
        double b = 5.3;

        String str2 = Integer.toString(a);
        String str3 = Double.toString(b);

        System.out.println(str2 + " " + str3);





    }
}
