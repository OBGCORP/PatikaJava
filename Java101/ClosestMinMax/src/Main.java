import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] valueList = {12, 42, -4, 0, 23, 1, 3, 90, -32};
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number to be checked: ");
        int number = inp.nextInt();
        int min = number;
        int max = number;

        for (int item : valueList) {
            if (item > number) {
                max = item;
                break;
            }
        }

        for (int i = valueList.length - 1; i >= 0; i--) {
            if (valueList[i] < number) {
                min = valueList[i];
                break;
            }
        }
        System.out.println("Closest max number: " + max + "\nClosest min number: " + min);
    }
}