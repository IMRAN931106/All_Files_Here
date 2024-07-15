// import java.util.*;
public class BitMask {
    public static void main(String args[]) {
      int number = 5; // 0101
      int position = 1;
      int bitMask = 1 << position;
// only for clear bit method 
int notBitMask = ~(bitMask);






      // get bit method

    //   if((bitMask & number) == 0) {
    //     System.out.println("Bit was zero");
    //   }else {
    //     System.out.println("Bit was one");
    //   }


// set bit method

// int newNumber = bitMask | number;
// System.out.println(newNumber);



// clear bit method
int newNumber = notBitMask & number;
System.out.println(newNumber);




     }
}
