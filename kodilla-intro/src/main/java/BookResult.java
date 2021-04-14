public class BookResult {
    public static void main(String[] args) {

        Book book = Book.of("Sharp objects", "Gillian Flynn");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());

    }
}
