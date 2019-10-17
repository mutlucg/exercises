import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();
        int[] stepTypes = new int[2]; // stepTypes[0] = 'U', stepTypes[1] = 'D'
        int valleyCount = 0;
        boolean isValley = false;
        for (int i = 0; i < n; i++) {
            if (steps[i] == 'U')
                stepTypes[1]++;
            else stepTypes[0]++;

            if (stepTypes[0] > stepTypes[1]) {
                isValley = true;
            }
            if (stepTypes[0] == stepTypes[1] && isValley) {
                isValley = false;
                valleyCount++;
            }
        }
        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        System.out.println(countingValleys(n, s));

        scanner.close();
    }
}
