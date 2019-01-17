package primenumber;

import java.util.Scanner;

/**
 *
 * @author Vinoth
 */
public class PrimeNumber {

    /*
    Function to check whether it is prime number or not.
        if prime 
            return true;
        else
            return false;
    */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the number of prime numbers: \n");
        int input = sc.nextInt(); //Get input from the user
        for (int j = 1; j <= input; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }
}
