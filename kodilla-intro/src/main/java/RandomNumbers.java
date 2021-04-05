import java.util.Random;

public class RandomNumbers {

    public int getCountOfRandomNumber() {

        Random random = new Random();
        int number = 0;
        int sum = 0;
        int maxSum = 5000;

        while (sum <= maxSum) {
            number = random.nextInt(31);
            number ++;
        }
        return number;
    }
    public int getMinNumber () {
        int minNumber = 0;

        return minNumber;
    }

    public int getMaxNumber () {
        int maxNumber = 0;

        return maxNumber;
    }
}
