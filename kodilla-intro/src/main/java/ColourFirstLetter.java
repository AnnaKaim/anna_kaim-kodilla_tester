import java.util.Scanner;

public class ColourFirstLetter {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the first letter of a colour (R-red, O-orange, Y-yellow, G-green, B-blue, P-purple)");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "R":
                    return "Red";
                case "O":
                    return "Orange";
                case "Y":
                    return "Yellow";
                case "G":
                    return "Green";
                case "B":
                    return "Blue";
                case "P":
                    return "Purple";
                default:
                    System.out.println("Unexpected response. Please try again.");
            }
        }
    }
}
