import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void oddsAndEvens(List<Integer> arrayList, ArrayList<Integer> odds, ArrayList<Integer> evens) {
        for (Integer integer : arrayList)
            if (integer % 2 == 1) synchronized (odds) {
                odds.add(integer);
            }
            else synchronized (evens) {
                evens.add(integer);
            }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        List<Integer> partOne = numbers.subList(0, 2499);
        List<Integer> partTwo = numbers.subList(0, 2499);
        List<Integer> partThree = numbers.subList(0, 2499);
        List<Integer> partFour = numbers.subList(0, 2499);

        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();

        Thread thread1 = new Thread(() -> oddsAndEvens(partOne, odds, evens));
        Thread thread2 = new Thread(() -> oddsAndEvens(partTwo, odds, evens));
        Thread thread3 = new Thread(() -> oddsAndEvens(partThree, odds, evens));
        Thread thread4 = new Thread(() -> oddsAndEvens(partFour, odds, evens));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(odds);
        System.out.println(evens);

    }

}