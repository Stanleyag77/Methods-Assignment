import java.util.Scanner;

class FactorialCalculator {
    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a non-negative integer: ");
        number = sc.nextInt();

        if (number < 0) {
            System.out.println("Error: Factorial of a negative number is undefined.");
        } else {
            long result = factorial(number);
            System.out.println(number + "! = " + result);
        }

        sc.close();
    }
}