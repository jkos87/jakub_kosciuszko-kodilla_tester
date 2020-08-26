public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;
        String exe = myExe();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(exe);

        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            String myExe;
        }
    }

    private static String myExe() {
       String text = "Hello Jacob";

        return text;
    }

    private static void subtractAndDisplay(int a, int b) {
        int result = a - b;

        System.out.println(result);
    }
}
