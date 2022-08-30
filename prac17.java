import java.util.*;
public class prac17 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows:");
    int row =sc.nextInt();
    // System.out.println("Enter the no of columns:");
    // int col=sc.nextInt();
    holllowRectangle(row);
    sc.close();
   }
   public static void holllowRectangle(int rows){
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows-i+1;j++){
            System.out.print(j);                        
        }
        System.out.println();
    }
   }
}