package Practice;
import java.util.*;
public class BasicFunctionInJava {

// Add two function ===========================================================================================
    // a method  to calculate sum of 2 number = a & b
    public static void sum(int a, int b) {
         int sum = a + b;
         System.out.println("Sum of " + a + " and " + b + " is " + " : " + sum);
    }


// multiple two function ===========================================================================================
public static int multiple(int a, int b) {
    int mul = a * b;
    return mul;
}
// factorial two function ===========================================================================================
public static void factorial(int n) {
    // base case (if code reach here then stop code)
    if(n < 0) {
       System.out.println("Invalid Number");
       return;
    }
    int fact = 1;
    for(int i = n; i >= 1; i--) {
            fact = fact * i;
    }
    System.out.println("Factorial of " + n + " is : " + fact);
    return;
}
// Prime function ===========================================================================================
public static void PrimeNo(int n) {
    boolean isPrime = true;
    for(int i = 2; i < n; i++) {
        if ((n % i) == 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrime) {
        if(n == 1) {
            System.err.println(n + " This is neither prime not composite");
        } else {
            System.out.println(n + " This is Prime number");
        }
    }else {
        System.out.println(n + " This is not a prime number");
    }
}
// even function ===========================================================================================
public static void evenFunction(int n) {
   if((n % 2) == 0) {
    System.out.println(n + " this is even number");
   }else {
    System.out.println(n + " this is odd number");
   }
}
// table function ===========================================================================================
public static void tableFunction(int n) {
   for(int i = 1; i <= 10; i++) {
    System.out.println(n + " * " + i + " = " + n * i);
   }
}

// main function it is a entry point
    public static void main(String args[]) {
       @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
       System.out.print("Enter Your First no : ");
       int first = sc.nextInt();
       sc.nextLine();
       // second input
       System.out.print("Enter Your Second no : ");
       int second = sc.nextInt();
       sc.nextLine();
       // factorial find input
       System.out.print("Enter Your no to find factorial : ");
       int fact = sc.nextInt();
       sc.nextLine();
    //    Prime find input
       System.out.print("Enter Your no to check is prime or not : ");
       int prime = sc.nextInt();
       sc.nextLine();
    //    even find input
       System.out.print("Enter Your no to check is even or odd : ");
       int evenNodd = sc.nextInt();
       sc.nextLine();
    //    table input
       System.out.print("Enter Your no to Print table : ");
       int table = sc.nextInt();
    //    sc.nextLine();

       // define function call
       // this function no return 
       sum(first, second);
       // this fuction return some value
       int mul = multiple(first, second);
       System.out.println("Multiple of " + first + " and " + second + " is " + " : " + mul);
       // this is also no return function
       factorial(fact);
       // this is also no return function
       PrimeNo(prime);
       // this is also no return function
       evenFunction(evenNodd);
       // this is also no return function
       tableFunction(table);
    }



}
