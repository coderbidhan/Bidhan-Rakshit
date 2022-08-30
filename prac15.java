import java.util.*;
public class prac15 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows:");
    int row =sc.nextInt();
    System.out.println("Enter the no of columns:");
    int col=sc.nextInt();
    holllowRectangle(row,col);
    sc.close();
   }
   public static void holllowRectangle(int rows,int cols){
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=cols;j++){
            if(i==1 || i==rows || j==1 || j==cols){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }            
        }
        System.out.println();
    }
   }
}