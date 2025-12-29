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
       
             score1(n);
              score2(n);
            score3(n);
     
            score4(n);

             score5(n);

            // score6(n);

            // score7(n);

            score8(n);
    }

    static void score1(int n){
         
        for(int i=0; i<n; i++){
                
            for(int j=0; j<n; j++){
                                     System.out.print("*");
            }
            System.out.println();
        }
    }

    
    static void score2(int n){
         
        for(int i=1; i<=n; i++){
                
            for(int j=1; j<=i; j++){
                                     System.out.print(i);
            }
            System.out.println();
        }
    }

    static void score3(int n){
         
        for(int i=1; i<=n; i++){
                
            for(int j=1; j<=n-i+1; j++){
                                     System.out.print(j);
            }
            System.out.println();
        }
    }

    static void score4(int n){
         
        for(int i=0; i<n; i++){
                
            for(int j=0; j< n-i+1; j++){
                                     System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                                     System.out.print("*");
            }
                 
            for(int j=0; j< n-i+1; j++){
                                     System.out.print(" ");
            }
            
            System.out.println();}
        }

        
    static void score5(int n){
         
        for(int i=0; i< 2*n-1; i++){
                
            int star = i;
            if(i>=n){
                star = 2*n - i;
            }
            for(int j=0; j< star; j++){
                                     System.out.print("* ");
            }
            // for(int j=0; j<2*i+1; j++){
            //                          System.out.print("*");
            // }
                 
            // for(int j=0; j< n-i+1; j++){
            //                          System.out.print(" ");
            // }
            
            System.out.println();
            
        }
    }
        static void score6(int n){

            int start =1;

            for(int i=0; i<n ; i++){

                if(i%2==0){
                    start=1;
                }
                else{start=0;}

                for(int j=0; j<=i; j++){
                    System.out.print(start);
                    start=1-start;
                }
                  
                System.out.println();
              
            }
        }

        static void score7(int n){

            int num =1;

            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                      System.out.print(num);
                      num = num +1;
                }
                System.out.println();
            }
        }
     static void score8(int n){
        for(int i=0; i<=n; i++){
            for(char ch='A'; ch<= 'A'+(n-i-1); ch++){
  System.out.print(ch);
            }
            System.out.println();
        }
     }

    
}
