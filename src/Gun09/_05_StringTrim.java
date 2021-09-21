package Gun09;

public class _05_StringTrim {
    public static void main(String[] args) {
        // trim : stringin sadece başında ve sadece sonundaki boşluk karakterlerini temizler.

        String text="  Merhaba Dünya  ";

        System.out.println("text in orjinal hali = ->" + text +"<-"); //->  Merhaba Dünya  <-
        System.out.println("text in trim lenmiş hali = ->" + text.trim() +"<-"); //->Merhaba Dünya<-
    }
}
