package Gun21;

public class _02_Tablo2 {
    public static void main(String[] args) {

        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

        int[][] tablo1={
                {1,2,3},
                {2,3,1} ,
                {5,5,5} ,
                {2,10,3}
        };

        int max=tablo1[0][0]; // 1 yani ilk elemanı atadık

        for(int satir=0;satir<tablo1.length;satir++) // tablo1.length : bu bana satır sayısını verir
        {
            for(int sutun=0;sutun<tablo1[satir].length;sutun++) // her satırın uzunluğunu verir
            {
                if (tablo1[satir][sutun]>max)
                    max=tablo1[satir][sutun];
            }
        }

        System.out.println("max = " + max);
    }
}
