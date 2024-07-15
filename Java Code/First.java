// import java.util.*;

// public class First {
//    public static void main(String[] args) {
//       // calculator
//       Scanner user_1 = new Scanner(System.in);
//       System.out.print("Enter Your 1st no : ");
//       int user = user_1.nextInt();

//       Scanner user_2 = new Scanner(System.in);
//       System.out.print("Enter Your 2st no : ");
//       int user2 = user_2.nextInt();

//       Scanner mathmethic = new Scanner(System.in);
//       System.out.print("Enter Your Operation : ");
//       int operation = mathmethic.nextInt();

//       switch (operation) {
//          case 1:
//             int add = user + user2;
//             System.out.println( user + "is added" + user2 + "and final result: " + add);
//             break;
//          case 2:
//             int sub = user - user2;
//             System.out.println( user + "is sub" + user2 + "and final result: " + sub);
//             break;
//          case 3:
//             int mul = user * user2;
//             System.out.println( user + "is multiple" + user2 + "and final result: " + mul);
//             break;
//          case 4:
//             int divide = user / user2;
//             System.out.println( user + "is divide" + user2 + "and final result: " + divide);
//             break;
//          case 5:
//             int module = user % user2;
//             System.out.println( user + "is divide" + user2 + "and final remender: " + module);
//             break;

//          default:
//             System.out.println("Please enter 1 to 5");
//             break;
//       }
//    }
// }

import java.util.*;

public class First {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         boolean exit = false;
         boolean firstTime = true;
         while (!exit) {
            System.out.println("Calculator Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            if (!firstTime) {
               System.out.println("6. Exit");
            } else {
               firstTime = false;
            }
            System.out.print("Enter Your Choice: ");
            int select = input.nextInt();
            if (select >= 1 && select <= 5) {
               System.out.println("Enter Your 1st number: ");
               int num_1 = input.nextInt();

               System.out.println("Enter Your 2st number: ");
               int num_2 = input.nextInt();
               switch (select) {
                  case 1:
                     System.out.println(num_1 + " + " + num_2 + " = " + (num_1 + num_2));
                     break;
                  case 2:
                     System.out.println(num_1 + " - " + num_2 + " = " + (num_1 - num_2));
                     break;
                  case 3:
                     System.out.println(num_1 + " * " + num_2 + " = " + (num_1 * num_2));
                     break;
                  case 4:
                     if (num_2 != 0)
                        System.out.println(num_1 + " / " + num_2 + " = " + (num_1 / num_2));
                     else
                        System.out.println("Cannot divide by zero!");
                     break;
                  case 5:
                     System.out.println(num_1 + " % " + num_2 + " = " + (num_1 % num_2));
                     break;

               }
            } else if (select == 6) {
               exit = true;
            } else {
               System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
         }
      }
      System.out.println("Exiting Calculator. Thank you for using!");
      System.out.println();
   }
}
