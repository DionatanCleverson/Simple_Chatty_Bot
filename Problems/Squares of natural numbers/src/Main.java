import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int square = 1;

        do {
            square = i * i;
            System.out.println(square);
            i++;
        } while (i * i <= N);
    }
}