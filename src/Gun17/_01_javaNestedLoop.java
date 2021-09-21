package Gun17;

public class _01_javaNestedLoop {

    public static void main(String[] args) {

        // 1 den 5 dahil e kadar sayilarin toplamini yazdiriniz
        //1+1=2
        //1+2=3
        //1+3=4
        //1+4=5
        //1+5=6

        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                System.out.println(i+"+"+j+"="+(i+j));

            }

            System.out.println(); //bloklari arasina bosluk birakiyor
        }





    }
}
