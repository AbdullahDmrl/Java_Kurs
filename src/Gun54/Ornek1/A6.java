package Gun54.Ornek1;

public class A6 implements IYazdirilabilir{
    @Override
    public void yaz() {
        System.out.println("interface yaz metodu dolduruluyor");
    }

    @Override
    public void gvenlikKontrol() {
        System.out.println("güvenli");
        // impliment edenler bu metodu mutlaka doldurmasi gerekiyor
    }
}
