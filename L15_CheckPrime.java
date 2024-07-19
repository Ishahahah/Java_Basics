import java.util.*;

public class L15_CheckPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number:");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("1 is neither prime nor composite");
            } else if (n == 2) {
                System.out.println("2 is prime");
            } else {
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(n + " is prime");
                } else {
                    System.out.println(n + " is not prime");
                }
            }
        } while (true);

    }

}
