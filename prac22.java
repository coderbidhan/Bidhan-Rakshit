import java.util.*;
public class prac22 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of rows:");
        int n= sc.nextInt();
        
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        // for(int i=n;i>=1;i--){
        //     //space
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //star
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
