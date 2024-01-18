import java.util.Scanner;

public class PrimeNumber {

    static void Prime(int n) {
        int temp = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                temp++;
            }
        }
        if (temp > 0) {
            System.out.println("Not a prime Number");
        } else {
            System.out.println("A prime number");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number=");
        int n = sc.nextInt();
        Prime(n);
    }
}
