public class Book {

  private String author;
    private String title;

    public Book(String author, String title){
        this.author= author;
        this.title= title;
           }
    public String toString() {
        return author + " " + title;
    }

    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        return book;
    }

    public static void main(String[] args) {

        System.out.println(Book.of("Isac","The Galaxy"));
    }
}
