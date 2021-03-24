public class Grades {

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void showLastGrade() {
        int i = 0;
        while (i <= this.size) {
            System.out.println(i);
        }
    }

    private int sumGrades(int[] grades) {
        int result = 0;
        for (int n = 0; n < this.grades[this.size]; n++) {
            result += this.grades[n];
        }
        return result;
    }

    public double getAverage(int[] average) {
        int sum = 0;
        for (int n = 0; n <= average.length; n++) {
            sum += average[n];
        }
        return sum / average.length;
    }
}

