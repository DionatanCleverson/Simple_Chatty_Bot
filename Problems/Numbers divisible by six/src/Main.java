import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sumOfMultiples = 0;

        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0 && number % 3 == 0) {
                sumOfMultiples += number;
            }
        }
        System.out.println(sumOfMultiples);
    }
}