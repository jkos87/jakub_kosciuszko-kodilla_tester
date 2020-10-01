public class Loops {
    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,4,5};

        System.out.println(sumNumbers(numbers));

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};

        int numberofElements = names.length;
        System.out.println("Moja tablica zawiera " + numberofElements + " elementów");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

