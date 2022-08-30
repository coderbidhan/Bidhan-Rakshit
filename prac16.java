import java.util.*;
public class prac16 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows:");
    int row =sc.nextInt();
    // System.out.println("Enter the no of columns:");
    // int col=sc.nextInt();
    reversepyramid(row);
    sc.close();
   }
   public static void reversepyramid(int rows){
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows-i;j++){
            System.out.print(" ");            
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
   }
}