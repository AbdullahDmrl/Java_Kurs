package Gun59.Soru;

public class AdanaKebap implements IFood{
    @Override
    public void taste() {
        System.out.println("Turkiyenin en iyi lezzeti");
    }

    @Override
    public double ucret() {
        return 5;
    }

    public void marinade(){
        System.out.println("Satir kiymasi kuyruk yagi ile marine edildi");
    }

    public void grill(){
        System.out.println("Odun komurunde grilledildi");
    }
}
