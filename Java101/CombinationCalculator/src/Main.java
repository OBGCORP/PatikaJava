public class Main {
    static int factorial(int n) {
        if (n == 0) return 1;
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    static int Combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        int n = 8, r = 5;
        System.out.println(Combination(n, r));
    }
}