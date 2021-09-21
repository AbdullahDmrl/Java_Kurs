package Gun39.Ornek2;

public class Ornek {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    // SILME işlemi kontrolü yapınız bir metod için.

    public static void main(String[] args) {

        User kul1=new User("Aycan",Role.MUDUR,Statu.AKTIF);
        User kul2=new User("Kaan",Role.SATIS,Statu.AKTIF);
        User kul3=new User("Musti",Role.ADMIN,Statu.AKTIF);
        User kul4=new User("Abdullah",Role.PERSONEL,Statu.PASIF);

        UserSil(kul1);
        UserSil(kul2);
        UserSil(kul3);

    }
    public static void UserSil(User kullanici)
    {
        if (kullanici.role == Role.ADMIN)
        {
            System.out.println("silme işlemi yapıldı");
        }
    }



}
