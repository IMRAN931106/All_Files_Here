// import java.util.*;
public class Strings {
    public static void main(String args[]) {
   StringBuilder str = new StringBuilder("Imran");
   for(int i = 0; i < str.length()/2; i++) {
      int front = i; // 1 2
      int back = str.length() - 1 - i; // 3 4
    
     char frontchar = str.charAt(front); // I m 
     char backchar = str.charAt(back); //  a n

     // here define change string 
     str.setCharAt(front, backchar); 
     str.setCharAt(back, frontchar); 
   }
   System.out.println(str);
    }
}
