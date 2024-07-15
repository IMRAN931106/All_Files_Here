package Practice;
import java.util.*;
public class PrimeNum {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Number to check is Prime or Not? : ");
        int checkPrimeNo = scanner.nextInt();

        boolean isPrime =   true;
        for(int i = 2; i <= checkPrimeNo/2; i++) {
        // for(int i = 2; i < checkPrimeNo; i++) { // this is also correct
            if ((checkPrimeNo % i) == 0) {
                isPrime = false;
                break;
            }
        }
       
        if (isPrime) {
            if(checkPrimeNo == 1) {
                System.err.println("This is neither prime not composite");
            } else {
                System.out.println("This is Prime number");
            }
        }else {
            System.out.println("This is not a prime number");
        }


    }
}
