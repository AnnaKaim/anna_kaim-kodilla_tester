import java.util.Scanner;

public class Book {

    public static String getAuthor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter author name:");
            String author = scanner.nextLine().trim();
            if (author.length() >= 2) {
                return author;
            }
            System.out.println("Author name is too short. Try again.");
        }
    }

    public static String getTitle() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter title:");
            String title = scanner.nextLine().trim();
            if (title.length() >= 1) {
                return title;
            }
            System.out.println("Title is too short. Try again.");
        }
    }

}

