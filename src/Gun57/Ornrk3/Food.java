package Gun57.Ornrk3;

public abstract class Food {

    public String name;

    public abstract String madeIn();
    public abstract String taste();

    @Override
    public String toString() {
       // madeIn(); void oldugu zaman burada calistirarak yapabiliriz
       // taste();
        return "Food{" +
                "name='" + name + '\'' +
                "Yapildigi yer='" + madeIn() + '\'' +
                "Tadi='" + taste() + '\'' +
                '}';
    }
}
