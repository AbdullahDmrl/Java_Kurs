package Gun48.Soru1;

public class User {

 private int id;
 private String username;
 private String password;
 private boolean isActive;
 private boolean isSignedIn;

 private static int  idSayac=1; // class a ait olmali sayac sistemden gelmeli

    public User(String username,String password) {

        setUsername(username);
        setPassword(password);
        setActive(true);
        setSignedIn(false);
        setId();
    }

    public int getId() {
        return id;
    }

    private void setId()
    {   // disardan mudahale olmasin diye private yaptim
        this.id = idSayac++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()<6)
           throw new RuntimeException("password 6 dan kucuk olamaz");

        else
            this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSignedIn() {
        return isSignedIn;
    }

    public void setSignedIn(boolean signedIn) {
        isSignedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                ", isSignedIn=" + isSignedIn +
                '}';
    }
}
