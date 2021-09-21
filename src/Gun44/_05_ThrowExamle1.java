package Gun44;

import java.util.Scanner;

public class _05_ThrowExamle1 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz=");
        String username=oku.nextLine();

        try {
            if (username.length() < 6)
                throw new Exception("Kullanıcı adı 6 karakterden az olamaz");
            // throw ile kendimiz hata oluşturuyoruz.
            // böylece kritelerimize girmeyenler için de
            // catch bloğunua düşürerek, paratik kullanım sağlıyoruz.
            // Burada ayrıca programın devamının çalışmasına gerek olmadığı için,
            // break gibi programın devamının çalışmasını engelliyoruz.

            if (username.length() > 10)
                throw new Exception("Kullanıcı adı 10 karakterden büyük olamaz.");
        }
        catch (Exception ex)
        {
            System.out.println("Hata="+ ex.getMessage());
            ex.printStackTrace();
            // log tutuluyor.
            // kimler bu hatalı girişleri yapmış
            // ....
            // bir çok kontrol tek yerde toplanıyor.
        }

    }
}
