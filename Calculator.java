import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Simple calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Choose an Option");
            
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator... Goodbye");
                break;  
            }

            if (choice < 1 || choice >4) {
                System.out.println("Invalid choice please try agian.");
                
            }
            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;


        switch (choice) {
            case 1:
            result = num1 + num2;
            break;
                case 2:
            result = num1 - num2;
            break;
            case 3:
            result = num1 * num2;
            break;
            case 4:
            if (num2 != 0) {
                result = num1/num2;
            }
            else{
                System.out.println("Error: Division by Zero");
            }
        
            default:
            System.out.println("Invalid choice please try again!");
            valid = false;  
                break;
        }
        if (valid) {
            System.out.println("Result:"+ result);
            
        }
    }
}
    
}
