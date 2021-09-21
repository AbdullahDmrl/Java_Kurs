package Gun39;

public class _01_Ornek {

        enum Aylar{
            Ocak,Subat,Mart,Nisan,Mayis,Haziran,Temmuz,Agustos,Eylul,Ekim,Kasim,Aralik   }

    public static void main(String[] args) {

            Aylar ay=Aylar.Nisan;


        switch (ay){

            case Ocak:  System.out.println(31) ;break;
            case Subat:  System.out.println(28) ;break;
            case Mart:  System.out.println(30) ;break;
            case Nisan:  System.out.println(31) ;break;
            case Mayis:  System.out.println(30) ;break;
            case Haziran:  System.out.println(31) ;break;
            case Temmuz:  System.out.println(30) ;break;
            case Agustos:  System.out.println(31) ;break;
            case Eylul:  System.out.println(31) ;break;
            case Ekim:  System.out.println(30) ;break;
            case Kasim:  System.out.println(31) ;break;
            case Aralik:System.out.println(31) ;break;
        }

        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("Bu ayın ENUM daki sırası = " + ay.ordinal());




    }
}
