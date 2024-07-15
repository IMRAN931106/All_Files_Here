package Practice;
import java.util.*;

public class ProblemSolving {

    // print avarage fuction
    public static void printAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println(average);
    }

    // print sum of all odd num
    public static void oddNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 2) != 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum of all odd is : " + sum);
    }

    // input two no and check which no is greater function
    public static int checkGreater(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return 0;
        }
    }

    // find circumference of circle
    public static Double findCircumference(Double radius) {
        Double pi = 3.14;
        return 2 * pi * radius;
    }
// check if eligible for vote or not 
public static  void checkVoteOrNot(int n) {
    if(n >= 18) {
        System.out.println(n + " is Eligible for vote");
    }else {
        System.out.println(n + " is Not Eligible for vote");
    }
}
    // main function
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your First Number : ");
        // int First = sc.nextInt();
        // sc.nextLine();
        // System.out.print("Enter Your Second Number : ");
        // int Second = sc.nextInt();
        // sc.nextLine();
        // System.out.print("Enter Your Third Number : ");
        // int Third = sc.nextInt();
        // sc.nextLine();
        // System.out.print("Enter Your Number : ");
        // int num = sc.nextInt();
        // sc.nextLine();
        // System.out.print("Enter Circle Radius : ");
        // Double radius = sc.nextDouble();
        // sc.nextLine();
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        // printAverage(First, Third, Second);
        // oddNumber(num);
        // int result = checkGreater(First, Second);
        // System.out.println(result + " is Greater");
        // System.out.println(findCircumference(radius));
        checkVoteOrNot(age);
    }

}