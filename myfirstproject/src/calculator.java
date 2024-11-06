import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            
            choice = sc.nextInt();
            
            if (choice == 5) {
                System.out.println("Exiting the calculator.Thank you !  Goodbye!");
                break;
            }

            
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            double result = 0;
            boolean valid = true;
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    valid = false;
                    break;
            }
            
            if (!valid) {
                continue;
            }
            
            
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String again = sc.next();
            if (again.equalsIgnoreCase("no")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
        }
        
        sc.close();
    }
}
