public class Main {
    static void printB(String[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (i == 0 && j < list[i].length - 1 || i == list.length - 1 && j < list[i].length - 1 || i == list.length / 2) {
                    list[i][j] = " * ";
                } else if (j == 0 || j == list[i].length - 1 && i >= ((list.length - 1) / 2) / 2 && i <= ((list.length - 1) / 2) * 2 - 1) {
                    list[i][j] = " * ";
                } else {
                    list[i][j] = "   ";
                }
                System.out.print(list[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        String[][] list = new String[10][15];
        printB(list);

    }
}