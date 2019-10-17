import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int numOfPairs = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (ar[i] > largest) {
                largest = ar[i];
            }
        }
        int[] dynamicArr = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            dynamicArr[ar[i]]++;
        }

        for (int i = 0; i < dynamicArr.length; i++) {
            numOfPairs += dynamicArr[i] / 2;
        }
        return numOfPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        System.out.println(sockMerchant(n, ar));
    }
}
