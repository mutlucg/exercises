import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long letterCount = s.chars().filter(i -> i == 'a').count();
        long iteration = n / s.length();
        letterCount *= iteration;
        if (n % s.length() != 0) {
           String remainder = s.substring(0, (int) (n % s.length()));
           letterCount += remainder.chars().filter(i -> i == 'a').count();
        }
        return letterCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(repeatedString(s, n));

        scanner.close();
    }
}
