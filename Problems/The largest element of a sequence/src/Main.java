import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int max = 0;

        while (i != 0) {
            if (i > max) {
                max = i;
            } else {
                i = scanner.nextInt();
            }
        }
        System.out.println(max);
    }
}