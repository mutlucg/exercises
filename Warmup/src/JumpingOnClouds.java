import java.util.Scanner;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        if (c.length == 2) return 1;
        int currCloud = 0;
        int steps = 0;
        while(currCloud < c.length - 2) {
            if (c[currCloud + 2] != 1)
                currCloud += 2;
            else
                currCloud += 1;
            steps++;
            if (currCloud == c.length - 2)
                steps++;
        }
        return steps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        System.out.println(jumpingOnClouds(c));

        scanner.close();
    }
}
