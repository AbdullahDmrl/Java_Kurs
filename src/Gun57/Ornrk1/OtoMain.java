package Gun57.Ornrk1;

public class OtoMain {
    public static void main(String[] args) {

       Ford ford1=new Ford();
        System.out.println(ford1.getMarka());
        ford1.setUretimYili(2021); // override ile degisiklik yaptim
        System.out.println("Uretim yili="+ford1.getUretimYili());
        ford1.setVitesSayisi(6); //degisiklik yapmadan oldugu gibi kullandigim metot
        System.out.println("Vites sayisi="+ford1.getVitesSayisi());



    }


}
