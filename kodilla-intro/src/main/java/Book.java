public class Book {

  private String author;
    private String title;
    private int liczbaStr;

    public Book(String author, String title, int liczbaStr){
        this.author= author;
        this.title= title;
        this.liczbaStr=liczbaStr;
           }
    public String toString() {
        return author + " " + title+" "+ liczbaStr;
    }

    public static Book of(String author, String title, int liczbaStr) {
        Book book = new Book(author, title, liczbaStr);
        return book;
    }

    public static void main(String[] args) {

        System.out.println(Book.of("Isac","The Galaxy", 100));
    }
}
