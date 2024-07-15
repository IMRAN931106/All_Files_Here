package Practice;
import java.util.*;

public class NaturalNum {
    public static void main(String args[]) {
      @SuppressWarnings("resource")
      Scanner iScanner = new Scanner(System.in);
    //   System.out.print("Enter Your no : ");
      int num = iScanner.nextInt();

      // while loop
      int i = 1;
      while (i <= num) {
        if((i % 2) == 0) {
            System.out.println(i);
        }
        i++;  // Increment i to avoid infinite loop
      }

      // do while loop
    //   int i = 1;
    //   do{
    //     if ((i % 2) == 0) {
    //         System.out.println(i);
    //     }
    //     // System.out.println("no");
    //     i++;
    //   }while(i <= num);

      // for loop to print even numbers
    //   for(int i = 1; i <= num; i++) {
    //     if((i % 2) == 0) {
    //         System.out.println(i + " is even");
    //     };
    //   }   
    
    for(; ;) {
        System.out.println("Apna College");
    }

    }
}
