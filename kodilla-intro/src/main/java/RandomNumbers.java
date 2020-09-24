import java.util.*;

public class RandomNumbers {
    private int min;
    private int max;

    public RandomNumbers() {
        this.min = 30;
        this.max = 0;
    }

    public int getMin() {
        return this.min;
    }

    public void sum() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31); //random.nextInt(30) lub (int) (Math.random() * 31)
            sum = sum + temp;
            result++;
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
    }

    public static void main(String[] args) {
        RandomNumbers random = new RandomNumbers();
        random.sum();
        System.out.println(random.getMin());

    }

}
