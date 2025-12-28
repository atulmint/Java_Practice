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
