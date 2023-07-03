import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner declared for taking input values 
        //while loop
        while (true) {
            System.out.println("Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6. Power");
            System.out.println("7. Logarithm");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();//Input choise from user 

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();//first no input 
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();//second no input 

                double result = 0;

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);//addition 
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);//subtraction
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);//multiplication
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);//Division
                        } else {
                            System.out.println("Error: Division by zero");
                        }
                        break;
                }
            } else if (choice >= 5 && choice <= 7) {
                System.out.print("Enter a number: ");
                double number = scanner.nextDouble();//input here 
                double result = 0;

                switch (choice) {
                    case 5:
                        result = Math.sqrt(number);
                        System.out.println("Square root: " + result);//squareroot 
                        break;
                    case 6:
                        System.out.print("Enter the exponent: ");
                        double exponent = scanner.nextDouble();
                        result = Math.pow(number, exponent);
                        System.out.println("Result: " + result);//Power
                        break;
                    case 7:
                        result = Math.log(number);
                        System.out.println("Logarithm: " + result);//logs 
                        break;
                }
            } else if (choice == 8) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
