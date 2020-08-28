public class Loops {
    public static void main(String[] args) {
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};

        int numberofElements = names.length;
        System.out.println("Moja tablica zawiera " + numberofElements + " elementów");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

