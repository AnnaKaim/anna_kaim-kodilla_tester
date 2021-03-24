public class GradesRunner {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        Grades grades1 = new Grades();
        double average = grades1.getAverage(array);
        System.out.println(average);
    }
}
