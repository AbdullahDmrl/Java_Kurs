package Gun22;

import java.util.Scanner;

public class _05_javaMethod {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int secim=0;       
       
        do{
            menuYaz();
            secim=oku.nextInt();
            islemYap(secim);
        }while (secim<6);        
        
    }

    public static void menuYaz(){
        System.out.println("****** Menü *******");
        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bölme");
        System.out.println("5-faktöryel");
        System.out.println("6-Çıkış");
        System.out.print("Seçiminiz=");
    }

    public static void islemYap(int secim)
    {
        Scanner oku=new Scanner(System.in);
    
                System.out.print("1.Sayı = ");
              int  sayi1 = oku.nextInt();
                System.out.print("2.Sayı = ");
              int  sayi2 = oku.nextInt();
                
        switch (secim)
        {
            case 1:
                System.out.println("Toplam="+(sayi1+sayi2));;break;
            case 2:System.out.println(sayi1-sayi2);break;
            case 3:System.out.println(sayi1*sayi2);break;
            case 4:System.out.println(sayi1/sayi2);break;
            case 5:faktoryel(sayi1);break;
        }
    }
   
    public static void faktoryel(int a){
        
        int faktoriyel=1;
        
        for (int i = a; i >0 ; i--) {
            faktoriyel*=i;            
        }
        System.out.println("faktoriyel = " + faktoriyel);
    }
        
        }
