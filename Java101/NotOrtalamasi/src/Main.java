import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void gradeAverage() {
        System.out.println("Enter Mathematics Grade");
        int mathGrade = scanner.nextInt();
        System.out.println("Enter Physics Grade");
        int physicsGrade = scanner.nextInt();
        System.out.println("Enter Chemistry Grade");
        int chemistryGrade = scanner.nextInt();
        System.out.println("Enter Turkish Grade");
        int turkishGrade = scanner.nextInt();
        System.out.println("Enter Musics Grade");
        int musicsGrade = scanner.nextInt();
        float average = (mathGrade + physicsGrade + chemistryGrade + turkishGrade + musicsGrade) / 5f;
        System.out.println("Your grade average is: " + average);
        System.out.println(average < 60 ? "You have failed the class." : "You have passed the class.");
    }
    public static void main(String[] args) {
        gradeAverage();
    }
}