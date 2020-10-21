public class Book {

  private String author;
    private String title;
    private int liczbaStr;
    //private Wydawnictwo tekst; wczesniej trzeba stworzyc klase WYdawnictwo i w niej umimescic zmienne i gettery

    public Book(String author, String title, int liczbaStr){ //Wydwanictwo wydwanictwo){
        this.author= author;
        this.title= title;
        this.liczbaStr=liczbaStr;
        //this.tekst = wydwanictwo;
        //
        }
    public String toString() {
        return author + " " + title+" "+ liczbaStr; //+ tekst.getNaklad
    }

    public static Book of(String author, String title, int liczbaStr) {
        Book book = new Book(author, title, liczbaStr);
        return book;
    }

    public static void main(String[] args) {

        System.out.println(Book.of("Isac","The Galaxy", 100));
    }
}
