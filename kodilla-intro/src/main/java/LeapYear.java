public class LeapYear {
    public static void main(String[] args) {
        int year;
        year = 2020;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Rok " + year + " to rok przestępny.");
        } else {
            System.out.println("Rok " + year + " nie jest rokiem przestępnym.");
        }
    }
}
