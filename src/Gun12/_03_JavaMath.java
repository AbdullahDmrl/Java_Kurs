package Gun12;

public class _03_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b= 4;

        System.out.println("a nın mutlak değeri = " + Math.abs(a));
        System.out.println("a ve b den en büyük olanı = " + Math.max(a,b));
        System.out.println("2,6,8 den en büyük olanı =" + Math.max(2, Math.max(6,8)));
        System.out.println("a ve b den en küçük olanı =" + Math.min(a,b));
        System.out.println("b nin kare kökü =" + Math.sqrt(b));
        System.out.println("2 nin 3.kuvveti =" + Math.pow(2,3));
        System.out.println("round 3.1=" + Math.round(3.1));
        System.out.println("round 3.5= " + Math.round(3.5));
        System.out.println("ceil 3.1= " + Math.ceil(3.1));  // Tavan
        System.out.println("ceil 3.5 = " + Math.ceil(3.5));
        System.out.println("floor 3.1= " + Math.floor(3.1)); // Taban
        System.out.println("floor 3.5 = " + Math.floor(3.5));




    }
}
