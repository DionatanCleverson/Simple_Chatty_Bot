import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxDivisor = 0;

        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0) {
                if (number > maxDivisor) {
                    maxDivisor = number;
                }
            }
        }
        System.out.println(maxDivisor);
    }
}