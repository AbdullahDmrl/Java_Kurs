package Gun29;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        Map<String,String> semihKartvizit = new HashMap<>();
        semihKartvizit.put("isim", "Semih Nerde");
        semihKartvizit.put("email", "Semih@hotmail.com");
        semihKartvizit.put("adres", "Frkanfurt/Almanya");
        semihKartvizit.put("telefon", "0 532 230000");

        System.out.println("semihMap.get(isim) = " + semihKartvizit.get("isim"));
        System.out.println("semihMap.get(telefon) = " + semihKartvizit.get("telefon"));

        Map<String,String> ismailKartvizit = new HashMap<>();
        ismailKartvizit.put("isim", "İsmail Demir");
        ismailKartvizit.put("email", "ismail@gmail.com");
        ismailKartvizit.put("adres", "Amsterdam/Hollanda");
        ismailKartvizit.put("telefon", "0 546 450000");

        System.out.println("ismailKartvizit.get(isim) = " + ismailKartvizit.get("isim"));
        System.out.println("ismailKartvizit.get(telefon) = " + ismailKartvizit.get("telefon"));

           //semih    kartviziti
        Map<String, Map<String,String>  >   kartvizitler=new HashMap<>();
        kartvizitler.put("semih", semihKartvizit);
        kartvizitler.put("ismail", ismailKartvizit);

        System.out.println("semih in telefonu = " + kartvizitler.get("semih").get("telefon"));
        System.out.println("ismail in bilgileri = " + kartvizitler.get("ismail"));
        System.out.println("kartvizitler = " + kartvizitler);




    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
