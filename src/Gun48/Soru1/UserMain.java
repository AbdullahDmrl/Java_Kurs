package Gun48.Soru1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {

        ArrayList<User> users=new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int sayac=1;
        boolean userNameIste=true;
        String username="";
        do {

            if (userNameIste) {
                System.out.print(sayac + ". username=");
                username = scan.nextLine();
            }

            System.out.print(sayac+". password=");
            String password = scan.nextLine();

            try {
                User user = new User(username, password);
                users.add(user);
                userNameIste=true;
                sayac++;
            }
            catch(Exception ex) {
                userNameIste=false;
                System.out.println(ex.getMessage());
            }
        }while (users.size()<2);

        System.out.println(users);


    }


}
