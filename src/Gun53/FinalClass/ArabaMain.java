package Gun53.FinalClass;

public class ArabaMain {
    public static void main(String[] args) {


        Tasit tasit=new Tasit();
        tasit.setModel("opel");

        System.out.println("tasit = " + tasit);// tasit = Tasit{model='opel'}

        // main de sadece final class i refarans vererek kullanabiliriz baska bir class a inheritance olmaz

    }
}
