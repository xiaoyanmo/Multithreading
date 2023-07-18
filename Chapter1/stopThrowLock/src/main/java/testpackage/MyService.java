package testpackage;

public class MyService extends Thread {

    private String username = "a";
    private String password = "aa";

    synchronized public String getUsername() {
        return username;
    }

    synchronized public String getPassword() {
        return password;
    }

    synchronized public void printString(String username,
                                         String password) {
        try {
            this.username = username;
            Thread.sleep(10000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
