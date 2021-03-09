public class SimpleArray {
    public static void main(String[] args) {

        String[] books = new String[5];

        books[0] = "The unbearable lightness of being";
        books[1] = "American psycho";
        books[2] = "Call me by your name";
        books[3] = "Sharp objects";
        books[4] = "Witaj zajączku";

        String book = books[3];
        System.out.println(book);

        int numberOfElements = books.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
    }
}