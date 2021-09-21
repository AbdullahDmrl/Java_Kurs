package Gun33._01_Ornek;

public class JavaClassStatic {
    public static void main(String[] args) {

// string to int ve int to szring

        // 1  yontem
        int sayi=345;
        String strRakam=String.valueOf(sayi);

        int intRakam=Integer.parseInt(strRakam);

        // 2 class tan cagirma
        Utility uti=new Utility(); // static olmayan metodu cagirma
       strRakam=uti.getString(sayi);
        System.out.println("strRakam = " + strRakam);
       intRakam=uti.getInt(strRakam);
        System.out.println("intRakam = " + intRakam);

       //3 Yontem static metoddan cagirma new gerek yok
        strRakam=Utility.getsString(sayi); // new olusturmaya gerek yok
        System.out.println("strRakam = " + strRakam);
        intRakam=Utility.getsInt(strRakam);



    }
}
