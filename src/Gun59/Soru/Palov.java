package Gun59.Soru;

public class Palov implements IFood{
    @Override
    public void taste() {
        System.out.println("Mukemmel bir Bosnak lezzet");
    }

    @Override
    public double ucret() {
        return 2;
    }
    public void fry(){
        System.out.println("Galeta unuyla marine edilip kizartilir");
    }
    public void boil(){
        System.out.println("Bosna bolgesinin aycicek yaginda altin sarisi olana kadar kizartilir");
    }
}
