import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number == 2) {
                d++;
            } else if(number == 3) {
                c++;
            } else if(number == 4) {
                b++;
            } else if (number == 5) {
                a++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }

}