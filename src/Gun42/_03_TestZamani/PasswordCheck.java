package Gun42._03_TestZamani;

public class PasswordCheck {
    String passWord;


    public String PasswordCheck(String sifre) {

        if (sifre.length() < 8) {
       return "Sifre minimum sekiz karakterden olusmalidir";
        }
        if (sifre.replaceAll("[\\D]", "").isEmpty()) {
            return "Sifre en az bir rakam icermeli";
        } else if (sifre.replaceAll("[\\d]", "").isEmpty()) {
            return "Sifre en az bir harf icermeli";
        } else {
            this.passWord = sifre;
            return passWord;
        }

    }


}
