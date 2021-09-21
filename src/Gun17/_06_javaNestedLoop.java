package Gun17;

public class _06_javaNestedLoop {
    public static void main(String[] args) {

        // gunun sorusu
        //      *
        //     **
        //    ***
        //   ****
        //  *****

        for (int sat=1;sat<=5;sat++)
        {
            for (int bos=1;bos<=5-sat;bos++)
            {System.out.print(" ");}
            for (int sut=1;sut<sat;sut++)
            { System.out.print("*");}
            System.out.println();



        }


    }
}
