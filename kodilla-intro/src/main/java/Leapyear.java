public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Hello from Module0");
        int year = 2020;

        if ((year%4 ==0 && year%100!=0) || (year%400 ==0)){
            System.out.println("Leap year");
        } else {
            System.out.println("Is not leapr year.");
        }
    }
}
