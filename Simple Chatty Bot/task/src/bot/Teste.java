package bot;

public class Teste {

    public static void main(String[] args) {

        int i = 0;
        while(i < 10) {
            System.out.print(i);
            if (i == 5) {
                break;
            }
            i++;
        }

    System.out.println(" ");

        int j = 0;
        while(j < 10) {
            j++;
            if (j == 5) {
                continue;
            }
            System.out.print(j);
        }

        System.out.println(" ");

        for (int k = 0; k < 10; k++) {
            if (k > 5) {
                continue;
            }
            System.out.print(k);
        }
    }
}

