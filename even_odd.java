import java.util.*;
public class even_odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println(a+" Is a even no.");
        }else{
            System.out.println(a+" is a odd no.");
        }
        sc.close();
    }
}
