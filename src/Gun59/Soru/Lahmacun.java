package Gun59.Soru;

public class Lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("Ince hamudan mukemmel citir lezzet");
    }

    @Override
    public double ucret() {
        return 3;
    }
    public void dough(){
        System.out.println("Lahmacun hamuru 1 saat dinlendirilmis");
    }
    public void addMeat(){
        System.out.println("Sadece en taze erkek koyun kiymasi kullanilir");
    }
    public void bake(){
        System.out.println("Odun komuru firininda yarim saat pisirildi");
    }
}
