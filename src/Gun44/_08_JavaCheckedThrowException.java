package Gun44;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class _08_JavaCheckedThrowException {
    // kullanıcıdan hava sıcaklığını isteyiniz.
    // ayrı bir metodda bunun kontrolünü yaparak hava
    // sıcaklığı 10 dan küçük ise IOException(Input Output) hatası oluşturunuz
    // mainden çağırarak hatayı kontrol ediniz.

    public static  void SicaklikKontrol(int sicaklik) throws Exception {


        if (sicaklik <=10 ){

        // more Add Exception bolumunu secerek throws Exception yapmamiz gerekiyor methotlarda
         throw new Exception("Hava gerçekten soğuk dışarı çıkma");

        }
        else
            System.out.println("Dışarıda basketbol oynayabilirsin");


    }


    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Hava Sıcaklığı = ");
        int sicaklik = oku.nextInt();


        try {

        SicaklikKontrol(sicaklik);

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}
