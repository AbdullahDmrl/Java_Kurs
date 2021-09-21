package Gun54.Ornek3;

public class A4 implements IYazdirilabilir,IGosterilebilir{
    @Override
    public void goster() {
        System.out.println("Goster");
    }

    @Override
    public void yaz() {
        System.out.println("Yaz");
    }
}
