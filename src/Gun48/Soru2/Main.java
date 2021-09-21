package Gun48.Soru2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account hesap=new Account(1234,5000);
        Scanner oku=new Scanner(System.in);
        int sayac=0;
        do {
            bankaIsleleriMenu();
            System.out.print("Seciminizi giriniz=");
            int secim= oku.nextInt();
            sayac=secim;
            bankaIsleleri(hesap,secim);

        }while (sayac<4);


    }
    public static void bankaIsleleriMenu(){
        System.out.println("*******Banka Islemleri Menusu*****");
        System.out.println("Para yatirmak icin 1 e basiniz");
        System.out.println("Para cekmek icin 2 e basiniz");
        System.out.println("Hesap özeti icin 3 e basiniz");
        System.out.println("Cikmak icin 4 e basiniz");
    }
    public static void bankaIsleleri(Account hesap,int secim){
        Scanner oku=new Scanner(System.in);
        switch (secim){
            case 1:
                System.out.print("Yatirmk istediginiz miktari giriniz");
                double miktar= oku.nextDouble();
                System.out.println( hesap.Deposit(miktar)); break;
            case 2: System.out.print("Cekmek istediginiz miktari giriniz");
                double miktar1= oku.nextDouble();
                try {
                    System.out.println( hesap.WithDraw(miktar1));
                } catch (Exception e) {
                    System.out.println(e.getMessage());;
                }
                break;

            case 3:System.out.println(hesap.getBalance());break;  }    }


}
