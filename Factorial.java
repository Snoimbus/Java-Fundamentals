import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n; //longs instead of ints to avoid overflow errors, int overflows past 12! (479001600)
    while (true){
System.out.println("Enter a non negative integer: ");
    n = input.nextLong();  
    if(n < 0) {
        System.out.println("Factorial is not defined for negative integers. Please try again.");
        continue;
}
    long result = 1;
    for(long i = n -1; i>= 1; i--){ 
       result *= i;             
    }
    System.out.println("The factorial is: " + result);
 input.close();
 break;
}
}
}
//Longs were used over ints for bigger numbers without allowing for an unlimited range like with big integers. 