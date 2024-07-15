package Practice;
import java.util.*;
public class MenuDrivenProgram {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            System.out.print("Please Enter Your marks : ");
            int marks = scanner.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is Good");
            }else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            }else if (marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            }else {
                System.out.println("Invalid");
            }
            System.out.print("want to continue? (yes/no) : ");
            scanner.nextLine();
            input = scanner.nextLine();
        }while(input.equals("yes"));



        // ====================================================
        System.out.print("Enter Your no : ");
        int n = scanner.nextInt();
        
        for(int i = 1; i <= n; i++) {
            if((n % 2) == 0) {
                System.out.println(i);
            }
        }
    }
   
}
