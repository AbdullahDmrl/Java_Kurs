package Gun17;

public class _04_javaNestedLoop {
    public static void main(String[] args) {

        // asagidaki goruntuyu veren programi yaz. print icin yalnizca bir * kullan
        // *
        // **
        // ***
        // ****
        // *****

        for (int sat=1;sat<=5;sat++)
        {
            for (int sut=1; sut<=sat; sut++)
                System.out.print("#");
            System.out.println(); // alta geciriyor onemli



        }



    }
}
