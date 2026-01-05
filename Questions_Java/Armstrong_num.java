//An Armstrong number (or narcissistic number) is a number that equals the sum of its own digits,
//  each raised to the power of the total number of digits in the number, 
// like 153 (\(1^{3}+5^{3}+3^{3}=1+125+27=153\)) 
//  1634 (\(1^{4}+6^{4}+3^{4}+4^{4}=1+1296+81+256=1634\)). 
// They are a fun concept in number theory and common examples 
// in programming for beginners to practice loops and powers. 
package Questions_Java;

import java.util.*;
public class Armstrong_num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your number");
        int n = sc.nextInt();
        int temp = n; // temp me issiliye store kiye kyu  ki last me n ko comparison kar sake and temp ke sath 
                       //kuch bhi kar sake operations
        int result =0;

       //dhekh ke lagana Condition Baki Easy hai
        while( temp > 0){
           
            int last_digit= temp % 10; //Last Digit nikal rhe
            result= result + last_digit*last_digit*last_digit; // yaha pe 153  ka sirf 3 ka operation kar rhe
                                                               // and store kar rhe 
            temp= temp/10; //Yaha se aage ki digits ka got it

        }

        if( result == n){
            System.out.println("Yes' This is a armstrong number");
        }
        else{
            System.out.println("Noope!! Not Armstrong number");
        }

    }
}
