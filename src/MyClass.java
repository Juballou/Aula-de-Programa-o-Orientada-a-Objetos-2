import java.util.Locale;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myObj = new Scanner(System.in);
        String userName;

        System.out.println("Enter username");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);
    }
}
