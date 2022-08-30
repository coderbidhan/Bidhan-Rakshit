import java.util.*;
public class prac20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of rows:");
        int n= sc.nextInt();
        {//1st half
            for(int i=1;i<=n;i++){
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //space --2(n-i)
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        //2nd half
            for(int i=n;i>=1;i--){
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");                    
                }
                //space
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");                    
                }
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
