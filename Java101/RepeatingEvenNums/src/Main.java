public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 11, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 8, 9, 6, 4, 13};
        int[] copyArray = new int[arr.length];
        int copyArrayIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j] && arr[i] % 2 == 0) {
                    if (exists(copyArray, arr[i])) {

                        copyArray[copyArrayIndex++] = arr[i];

                    }
                }
            }
        }
        print(copyArray);
    }

    static boolean exists(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}