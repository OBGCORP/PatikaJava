import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numberList = {2, 4, 6, 8};
        double sum = 0;

        for (double item : numberList) {
            sum += 1 / item;
        }

        System.out.println(Arrays.toString(numberList) + " has an harmonic average of: " + numberList.length / sum);
    }
}