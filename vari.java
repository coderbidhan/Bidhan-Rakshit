import java.util.*;
public class vari{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a Number:");
        int n=sc.nextInt();
        //int fac=1;
        for (int i=1;i<=10;i++){
            //fac=fac*i;
            System.out.println(n+"X"+i+"="+n*i);            
        }
        
        sc.close();
    }
}