import java.util.*;

public class L16_SumEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum2 = 0;
        int sum1 = 0;

        int n;
        do {
            System.out.print("Enter a number (0 to exit):");
            n = sc.nextInt();
            if (n % 2 == 0) {
                sum1 += n;
            } else {
                sum2 += n;
            }

        } while (n != 0);

        System.out.println("Sum of even numbers : " + sum1);
        System.out.println("Sum of odd numbers : " + sum2);

    }
}
