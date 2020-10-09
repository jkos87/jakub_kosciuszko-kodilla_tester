import java.util.Scanner;

public class UserColors {
    public static String getUserFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of your color");
            String letter = scanner.nextLine().trim();
            if (letter.length() < 2){
                return letter;
            }
            System.out.println("Color is too long. Try again.");
        }
    }
    public static String getUserSelctionCol(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Selectr color: G-Grey, B-Black, O-Orange, W-White");
            String color= scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "G" : return "Grey";
                case "B" : return "Black";
                case "O" : return "Orange";
                case "W" : return "White";
                default:
                System.out.println("Wrong color try again.");
            }
        }
    }
}