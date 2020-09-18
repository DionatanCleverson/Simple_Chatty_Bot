import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sumOfMultiples = 0;
        double count = 0;

        //Find all multiples of 3 within [a,b]
        for (int i = a; i <= b; i++){
            if (i % 3 == 0) {
                sumOfMultiples += i;
                count++;
            }
        }
        double avg = sumOfMultiples / count;
        System.out.println(avg);
    }
}