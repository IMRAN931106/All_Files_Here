package Practice;
import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Your First no : ");
            int firstNum = input.nextInt();
            input.nextLine(); // Consume newline character
            System.out.print("Enter Your Second no : ");
            int secondNum = input.nextInt();
            input.nextLine(); // Consume newline character
            System.out.print("Enter Your Operation : ");
            String user_operation = input.nextLine();

            switch (user_operation) {
                case "+":
                    int sum = firstNum + secondNum;
                    System.out.println(firstNum + " + " + secondNum + " = " + sum);
                    break;
                case "-":
                    int sub = firstNum - secondNum;
                    System.out.println(firstNum + " - " + secondNum + " = " + sub);
                    break;
                case "/":
                    if (secondNum != 0) {
                        int divide = firstNum / secondNum;
                        System.out.println(firstNum + " / " + secondNum + " = " + divide);
                    }else {
                        System.out.println("Error : Cannot divide by zero.");
                    }
                    break;
                case "*":
                    int multiple = firstNum * secondNum;
                    System.out.println(firstNum + " * " + secondNum + " = " + multiple);
                    break;
                case "%":
                    int modulo = firstNum % secondNum;
                    System.out.println(firstNum + " % " + secondNum + " = " + modulo);
                    break;
                // case "stop":
                //     System.out.println("Calculator stopped.");
                //     input.close();
                //     return;
                default:
                    System.out.println("Please Enter Ypur valid Operation for example : + , - , * , / , % , or 'stop' to 'exit' ");
                    break;
            }
            // ask the user whether to continue or stop
            System.out.println("Do you want do any other Operation? (yes/no): ");
            String continueOption = input.nextLine();
            if (!continueOption.equalsIgnoreCase("yes")) { // match string
                System.out.println();
                input.close();// input function close 
                return;
            }
        }
      
    }
}

// System.out.print(i + "i");
// System.out.println();
// System.out.print(arr.length + "arr.len" );
// System.out.println();
// System.out.print(arr.length-1 + "arr.len-1");
// System.out.println();
