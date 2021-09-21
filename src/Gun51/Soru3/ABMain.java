package Gun51.Soru3;

public class ABMain {
    public static void main(String[] args) {

        ClassA a=new ClassA();
        System.out.println("ClassA.mesaj = " + ClassA.mesaj);
        // static olsugu icin class ismi ile ulasiyorum mesaj a !!!!!!!!
        // static olmasaydi referans ile ulasacaktim a.mesaj gibi


        ClassB b=new ClassB();
        System.out.println("ClassB.mesaj = " +ClassB.mesaj);

        ClassA a2=new ClassA();
        System.out.println("ClassA.mesaj = " +ClassA.mesaj);

        // Static değişkenlerin olduğu classlardan
        // oluşturulan subclaslarda, static değişkenin
        // değeri değiştirildiğinde, super classdaki de değişir.
        // Çünkü static değişkenler hafızada tek bir değeri
        // gösterirler.

//        A.mesaj = A dan merhaba
//        B.mesaj = B den Merhaba
//        A.mesaj = B den Merhaba
    }
}
