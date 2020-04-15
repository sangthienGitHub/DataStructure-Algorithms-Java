
/*
A number is a perfect number if is equal to sum of its proper divisors, that is,
sum of its positive divisors excluding the number itself.
Write a function to check if a given number is perfect or not.
Examples:

Input: n = 15
Output: false
Divisors of 15 are 1, 3 and 5. Sum of
divisors is 9 which is not equal to 15.

Input: n = 6
Output: true
Divisors of 6 are 1, 2 and 3. Sum of
divisors is 6.
*/
package Practices;
import java.util.Scanner;

public class PerfectNumber {

    private static Scanner scan;
    public static void main(String[] args){
        int sum = 0;
        int i;
        int userInput = 0;
        
        scan = new Scanner(System.in);
        System.out.print("\n Please enter a number to check for perfect number: ");

        if(scan.hasNextInt()){
            userInput = scan.nextInt();
        }else{
            System.out.println("please enter a real number");
            System.exit(0);
        }

        for (i = 1; i < userInput; i++){
            if(userInput % i == 0){
                sum = sum + i;
            }
        }

        if(sum == userInput){
            System.out.println(userInput + " is a perfect number");
        }else{
            System.out.println(userInput + " is NOT a perfect number");
        }
    }
}
