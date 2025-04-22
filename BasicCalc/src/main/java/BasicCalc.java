import java.util.Scanner;

public class BasicCalc {
    //created Scanner method so i dont have to type it out constanly
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Melchi's Basic Calculator\n");
        System.out.println();
        //Created Variables User will type. A Must When creating a calculator or any form of math.These are tools
        double val1;
        double val2;
        double result = 0;
        String operator = String.valueOf(0);

         /*Created while loop with string variables opInput First and second numbers
        What operation (addition, subtraction, etc.) they want to do.*/
        String opInput;
        while (true) {

            System.out.print("Enter first number: ".toUpperCase());
            double input;
            val1 = scanner.nextDouble();

            System.out.print("Enter your second number: ");
            val2 = scanner.nextDouble();
            scanner.nextLine();


            System.out.print("Select Operation: (A = Add , S = Subtract, M = Multiplication, D = Divison): ");
            opInput = String.valueOf(scanner.nextLine().trim().toUpperCase().charAt(0));

            if (!opInput.equals("A") && !opInput.equals("S") && !opInput.equals("M") && !opInput.equals("D")) {
                System.out.println("Invalid input. Try again!");
                continue;
            }

            operator = opInput;
            break;


        }

          //Created method to temporaily store input result/ asking it to prefrom the operation
        result = operationMath(val1, val2, operator);

         //Userdivides by zero(which means something went wrong, like dividing by zero), tell them to fix their mistake and try again.
        if (!Double.isNaN(result)) {
            System.out.println("Result is: " + result);
        } else {
            System.out.println("You Okay?! Try Again with a number, not a letter!!");
        }

    }
      //Created method much cleaner and streamlined code!
    public static double operationMath(double a, double b, String operate) {
        double resultP;

        //Introduced boolean and while Loops until user enters inputs required!
        boolean pickOperator = true;

        while (true) {

            switch (operate) {
                case "A":
                    resultP = a + b;
                    break;
                case "S":
                    resultP = a - b;
                    break;
                case "M":
                    resultP = a * b;
                    break;
                case "D":
                    if (b != 0) {
                        resultP = a / b;
                    } else {
                        System.out.println("Error: Why Divide by zero!.");
                        return Double.NaN;
                    }
                    break;
                default: {
                    System.out.println("Invalid operation selected.");
                    return Double.NaN;
                }
            }


            return resultP;
        }
    }
}