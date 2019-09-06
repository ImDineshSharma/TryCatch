import java.util.*;
public class apples {
     public static void main(String[] args) {
    	
    	 Scanner input = new Scanner(System.in);
    	 // i m telling the compiler that try the code from line 7 to 15
       // if it works then run the program(see line 18) but if theres an exception or error do this(line 19)
       
    	 try{System.out.println("Enter first num: ");
    	 int num1 = input.nextInt();
    	 
    	 System.out.println("Enter second num: ");
    	 int num2 = input.nextInt();
    	 
    	 int sum = num1/num2;
    	 
    	 System.out.println(sum);
    	 }
    	 catch (Exception e) {
    		 System.out.println("u entered wrong value");
    	 
    	 }
}
     }
     
     // of course we can also loop the try and catch until it meets the certain criteria 
