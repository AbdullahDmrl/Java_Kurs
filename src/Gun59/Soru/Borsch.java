package Gun59.Soru;

public class Borsch implements IFood{
    @Override
    public void taste() {
        System.out.println("Muhtesem yeni lezzetler");
    }

    @Override
    public double ucret() {
        return 3;
    }
    public void boil(){
        System.out.println("Sadece en taze zeytin yagi kullanilir");
    }
    public void eatTomorrow(){
        System.out.println("Mukemmel lezzet icin bir gun bekletmeniz tavsiye edilir");
    }

}
