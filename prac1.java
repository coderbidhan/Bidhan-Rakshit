//Java Program to Display All Prime Numbers from 1 to N
import java.util.*;
public class prac1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        
        sc.close();
    }
    public static boolean isPrime(int n){
        int div=2;
        if(n==1){
            return false;
        }else if(n==2){
            return true;
        }else{
            while(div<n){
                if(n%div==0){
                    return false;
                    
                }else{
                    div++;
                }
            }
            if(div==n){
                return true;
            }
        }
        return false;        
    }
        
}