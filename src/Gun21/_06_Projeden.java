package Gun21;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Projeden {
    public static void main(String[] args) {

 /*
       Verilen int array


       duplicated(tekrarlanan) öğeleri array den kaldır

      non-duplicated(tekrarlanmayan) öğe sayisini print et

       Örnek:

       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5 => 1,2,3,4,5

       //1 2 2 2 3 3 3 4 4 4 5 5 5

       result  5 olmalı

       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] arr = myStr.split(" ");

        int[] useThisArray = new int[arr.length];

        for(int i = 0 ; i < useThisArray.length ; i++){

            int num = Integer.parseInt(arr[i]);

            useThisArray[i] = num;

        }

//        code start here
//        dont change anything before this line
//        your Array is useThisLine

        // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
        //   useThisLine arrayini kullan

        String elemanan="";

        for(int j=0; j <useThisArray.length-1; j++)
            {
                if (useThisArray[j]==useThisArray[j+1])continue; // tekrar ediyor demektir
            elemanan=elemanan+useThisArray[j];

            }
        System.out.println("elemanan = " + elemanan);


        }


    }

