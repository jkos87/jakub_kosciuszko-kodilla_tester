import java.util.Scanner;

public class UserDialogs {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2){
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }
}
