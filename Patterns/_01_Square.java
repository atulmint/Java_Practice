/*
so this is the pattern we have to print

 *****
 *****
 *****
 *****

 The logic is very simple we have to run two loops one for rows and one for columns and print star in each column of every row and
then we will move to next line after every row is printed. and we will repeat this for n number of rows.
 
*/

package Patterns;

import java.util.*;
public class _01_Square {
    
    public static void main(String[] args) {
        System.out.println("Enter your number of sequence for the star");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
          score(n);
    }

    static void score(int n){
         
        for(int i=0; i<n; i++){
                
            for(int j=0; j<n; j++){
                                     System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
