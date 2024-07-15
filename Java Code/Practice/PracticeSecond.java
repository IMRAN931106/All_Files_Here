package Practice;

import java.util.*;

public class PracticeSecond {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int positive = 0, negative = 0, zeros = 0;
         * System.out.print("Press 1 to continue & 0 for stop : ");
         * int input = sc.nextInt();
         * 
         * while (input == 1) {
         * System.out.print("Enter Your Number : ");
         * int num = sc.nextInt();
         * 
         * if(num > 0) {
         * positive++;
         * }else if(num < 0) {
         * negative++;
         * }else {
         * zeros++;
         * }
         * System.out.print("Press 1 to continue & 0 for stop : ");
         * input = sc.nextInt();
         * }
         * 
         * 
         * System.out.println("Positive : " + positive);
         * System.out.println("Negative : "+ negative);
         * System.out.println("Zeros : " + zeros);
         */
        // ======x^n function========================================================
        /*
         * String ask = "yes";
         * while (ask.equals("yes")) {
         * System.out.print("Enter x : ");
         * int x = sc.nextInt();
         * sc.nextLine();
         * System.out.print("Enter n : ");
         * int n = sc.nextInt();
         * sc.nextLine();
         * 
         * int result = 1;
         * for (int i = 1; i <= n; i++) {
         * result = result * x;
         * }
         * System.out.println(x + " to the power " + n + " is : " + result);
         * 
         * System.out.print("Do you want to find more x^n values? (yes/no): ");
         * ask = sc.nextLine();
         * }
         */
        // ===fibonacci function=========================
       /* System.out.print("Enter your number : ");
        int num = sc.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " ");
        if(num > 1) {
            for(int i = 2; i <=num; i++) {
                System.out.print(b + " ");
                //swaping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }  */
        // =============Greatest common divisor====================================
        System.out.print("Enter your first number : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your second number : ");
        int num2 = sc.nextInt();

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            }else {
                num2 = num2 - num1;
            }
        }
        System.out.println("Greatest Common Divisor is : " + num1);
    }
}
