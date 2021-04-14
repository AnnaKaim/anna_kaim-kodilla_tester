public class Book {

    private String author;
    private String title;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static Book of(String title, String author) {
        return new Book(title, author);
    }

}

