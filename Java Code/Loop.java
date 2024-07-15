import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    try (// pattern question
    Scanner input = new Scanner(System.in)) {
      // Scanner input = new Scanner(System.in);
      System.out.print("Enter Your no : ");
      int user_input = input.nextInt();
      for (int i = 0; i < user_input; i++) {
        // Print spaces for formatting
        for (int j = 0; j < user_input - i; j++) {
            System.out.print(" ");
        }

        int number = 1;
        for (int j = 0; j <= i; j++) {
            System.out.print(number + " ");
            number = number * (i - j) / (j + 1);
        }
        System.out.println();
 }
      // for(int i = 1; i <= user_input; i++) {
      // //forword space
      // for(int j = 1; j <= user_input - i + 1; j++){
      // System.out.print(" ");
      // }
      // // star
      // for(int j = 1; j <= user_input-1; j++){
      // System.out.print("*" + "");
      // }
      // //back forword space
      // for(int j = 1; j <= user_input - i + 1; j++){
      // System.out.print(" ");
      // }
      // System.out.println();
      // }
    }

    // for(int i = user_input; i >= 1; i--){
    // for(int j = 1; j <= i; j++){
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }

  }
}
// loop concept

// for (int counter = 0; counter <= 10; counter++) { // for(int counter = 0; its
// blanck for infinete loop that is
// // harmfull for code; counter++)
// System.out.print(counter + " ");
// System.out.println("Hello Imran .....!");
// }

// int i = 0;
// while(i <= 10) {
// System.out.print(i + " ");
// i++;
// }

// int i = 0;
// do{
// System.out.println(i);
// i++;
// }while(i <= 10);

// Scanner input = new Scanner(System.in);
// System.out.print("Enter your no : ");
// int user_input = input.nextInt();

// System.out.println("Even numbers from 1 to " + user_input);
// for (int i = 1; i <= user_input; i++) {
// if (i % 2 == 0) {
// System.out.println(i);
// }
// }

// for(; ;) { // infinate loop
// System.out.println("Apna College");
// }

// prime no
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int number = input.nextInt();

// if (isPrime(number)) {
// System.out.println(number + " is a prime number.");
// } else {
// System.out.println(number + " is not a prime number.");
// }
// }

// public static boolean isPrime(int number) {
// if (number <= 1) {
// return false;
// }
// for (int i = 2; i <= number - 1; i++) {
// if (number % i == 0) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int choice;

// do {
// System.out.println("Menu:");
// System.out.println("1. Enter student's marks");
// System.out.println("0. Exit");
// System.out.print("Enter your choice: ");
// choice = input.nextInt();

// switch (choice) {
// case 1:
// enterStudentMarks(input);
// break;
// case 0:
// System.out.println("Exiting program. Goodbye.....!");
// break;
// default:
// System.out.println("Invalid choice. Please enter 1 or 0.");
// }
// } while (choice != 0);
// }

// public static void enterStudentMarks(Scanner input) {
// int marks;

// do {
// System.out.print("Enter student's marks (out of 100, -1 to exit): ");
// marks = input.nextInt();

// if (marks == -1)
// break;

// if (marks >= 90) {
// System.out.println("This is very Good");
// } else if (marks >= 60) {
// System.out.println("This is also Good");
// } else if (marks >= 0) {
// System.out.println("This is Good as well");
// } else {
// System.out.println("Invalid input! Marks should be between 0 and 100.");
// }
// } while (true);

// }
// }

// Scanner input = new Scanner(System.in);
// System.out.print("Enter your no: ");
// int user_input = input.nextInt();
// sum of n number
// int sum = 0;
// for(int i = 1; i <= user_input; i++) {
// sum = sum + i;
// }
// System.out.println("Total sum is :" + sum);

// table
// for(int i = 1; i <= 10; i++) {
// System.out.println(user_input + "*" + i + "=" + user_input * i);
// }