package Gun54.Ornek4;

public class Test implements IGoster,IYazdir{
    @Override
    public void goster() {
        System.out.println("Goster");
    }

    @Override  // iki class dada yaz metodu olmasina ragmen isimleri ve parametreleri ayni oldugu icin
                // tek bir metot kabul eder.
    public void yaz() {
        System.out.println("yaz");
    }

    @Override
    public void yaz(String mesaj) {
        System.out.println(mesaj+" yaz");
    }

    // implemente edilen interfaceler de aynı isim ve paramatrede
    // olan metdolardan bir tane yazmak yeterlidir,
    // problem oluşturmaz.
}




