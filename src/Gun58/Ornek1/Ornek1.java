package Gun58.Ornek1;


class C{
    public C() {
        System.out.println("C ");
    }
}

class B extends C{
    public B() {
        //super(); // C nin constructor
        System.out.println("B ");
    }
}

class A extends B{
    public A() {
        //super(); // B nin constructor
        System.out.println("A ");
    }
}


public class Ornek1 {
    public static void main(String[] args) {
        A a=new A();

    }

}
