package Questions_Java;
import java.util.*;
public class divisor {
    public static void main(String[] args) {
        System.out.println("Enter your number that you want to check the divisor: ");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        divi(n);
    }

    static void divi(int n){
        System.out.println("Divisors of " + n + ": ");
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
