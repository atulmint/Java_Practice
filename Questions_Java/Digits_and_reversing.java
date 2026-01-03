/*Count all Digits of a Number

You are given an integer n. You need to return the number of digits in the number.



The number will have no leading zeroes, except when the number is 0 itself.


Example 1

Input: n = 4

Output: 1

Explanation: There is only 1 digit in 4.

Example 2

Input: n = 14

Output: 2

*/


package Questions_Java;
import java.util.*;

public class Digits_and_reversing {
    public static void main(String[] args) {
        System.out.println("Enter your Digit of number that you have to count  :  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countkr(n);
    }


     static void countkr(int n){
    
        int count =0;
        while(n>0){
            
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n/10;
            count = count +1;
        }
        System.out.println(count);
    }
}
/*If the number of iteration based on division the time complexity will be in O(log n) because the number of digits in a number is log10(n)*/