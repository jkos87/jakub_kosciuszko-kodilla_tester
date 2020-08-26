public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[5];
        movies[0]="Matrix";
        movies[1] = "Bond";
        movies[2] = "Szybcy i wściekli 6";
        movies[3] = "Złoto dezerterów";
        movies[4] = "Chłopaki nie płaczą";

        String movie = movies[3];
        System.out.println(movie);

        int numberofElements = movies.length;
        System.out.println("Moja tablica zawiera " +numberofElements+ " elementów");
    }
}
