import java.util.Scanner;

class Calculator {
    // Static method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Non-static method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Static method for division with zero check
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;
        double num1, num2, result;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = Calculator.add(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = calc.subtract(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    result = Calculator.divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result = " + result);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Calculator...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select from the menu.");
            }

        } while (choice != 4);

        sc.close();
    }
}