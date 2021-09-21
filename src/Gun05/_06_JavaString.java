package Gun05;

public class _06_JavaString {
    public static void main(String[] args) {
        // ad="yeni ismet"; tanımdan önce kullanılamaz
        int sayi =5;
        String ad="ismet"; // String ifadelerin sayı gibi sınırı belli olmadığından
        String soyad="temur"; // "" ile sınırı belirtilir.

        System.out.println(ad); // -> ismet -> çift tırnak yok ise değişkendir mutlaka
                               //              ve değeri yazılır
        System.out.println("ad"); // -> ad -> "" arasında ne varsa direk yazılır

        // Çift tırnak arasında yazılmayan her şey değişken olarak kabul edilir.
        
        // int toplam=a+b;
        String fullName="ad"+"soyad";
        System.out.println("fullName = " + fullName); // -> fullName = adsoyad

        fullName=ad+" "+soyad;
        System.out.println("fullName = " + fullName); // -> fullName = ismettemur

        int yas=45;
        int kilo=72;
        String bilgi=ad+" "+soyad+" "+ yas +" "+kilo;
        System.out.println("bilgi = " + bilgi); // -> ismet temur 45 72
        // toplama işleminde eğer bir tane bile string değişken varsa hepsi string kabul edilir sadece işlemde.

        bilgi=ad+" "+soyad+" yas="+ yas +" kilo="+kilo;
        System.out.println("bilgi = " + bilgi); // -> ismet temur yas=45 kilo=72

        bilgi=ad+" "+soyad+" "+ (yas +kilo); // bilgisayar önce parantezin için yapar yani sayısal toplar
        System.out.println("bilgi = " + bilgi); // -> ismet temur 117
    }
}
