package Gun54.Ornek2;

public class GrafiklerMain {
    public static void main(String[] args) {
        //bir interface in birden class tarafından implemente edilmesi
        Cember c=new Cember();
        c.Ciz();

        Dikdortgen d=new Dikdortgen();
        d.Ciz();

        //interface lerden nesne üretileme fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizdirilebilir cember2=new Cember();
        cember2.Ciz();




    }

}
