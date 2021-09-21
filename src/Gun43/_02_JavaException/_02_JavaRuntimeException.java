package Gun43._02_JavaException;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz=");
        int a=oku.nextInt();

        System.out.print("2.Sayıyı giriniz=");
        int b=oku.nextInt();

        System.out.println("a/b = " + a/b); // b=0 verirsek Arithmetic Exception by zero hatasi
                                            // program calisir hatayi gösterir


    }
}
