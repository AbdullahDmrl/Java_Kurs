package Gun42._03_TestZamani;


import org.junit.Assert;
import org.junit.Test;

public class TestZamani {
    // Kullanıcının yazdığı metodu 2 adet test yazarak test ediniz.
    // Metod : aldığı bir sifrenin 8 karakterden az olmamasını ve
    // içinde en az bir rakam ve harf olup olmadığını kontrol eden metod olsun.

    @Test
    public void passCheck1() {
        PasswordCheck sifre = new PasswordCheck();
        String result = sifre.PasswordCheck("45klHd");
        String expected = "Sifre minimum sekiz karakterden olusmalidir";
        System.out.println("expected = " + expected);
        System.out.println("result = " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void passCheck2() {
        PasswordCheck sifre = new PasswordCheck();

        String result = sifre.PasswordCheck("dfghkklHd");
        String expected = "Sifre en az bir rakam icermeli";
        System.out.println("expected = " + expected);
        System.out.println("result = " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void passCheck3() {
        PasswordCheck sifre = new PasswordCheck();
        String result = sifre.PasswordCheck("12345678");
        String expected = "Sifre en az bir harf icermeli";
        System.out.println("expected = " + expected);
        System.out.println("result = " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void passCheck4() {
        PasswordCheck sifre = new PasswordCheck();
        String result = sifre.PasswordCheck("abd4588dg");
        String expected = sifre.passWord;
        System.out.println("expected = " + expected);
        System.out.println("result = " + result);
        Assert.assertEquals(expected, result);
    }

}
