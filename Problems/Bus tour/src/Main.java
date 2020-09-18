import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int[] bridgeHeights = new int[numberOfBridges];

        for (int i = 1; i <= numberOfBridges; i++) {
            bridgeHeights[i-1] = scanner.nextInt();
            if (bridgeHeights[i-1] > busHeight) {
                continue;
            } else {
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }
        Arrays.sort(bridgeHeights);
        if (busHeight < bridgeHeights[0]) System.out.println("Will not crash");
    }
}