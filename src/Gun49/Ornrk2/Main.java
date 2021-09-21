package Gun49.Ornrk2;

public class Main {
    public static void main(String[] args) {
        Hayvan hayvan=new Hayvan("yok", 0, "Genel");
        hayvan.konustu();

        Kopek kopek=new Kopek("beyaz", 10, "kangal");
        kopek.konustu();
        kopek.yemekYedi();

        Kus kus=new Kus("gri",1,"muhabbet");
        kus.konustu();
        kus.yemekYedi();

    }
}
