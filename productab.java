import java.util.*;
public class productab {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The first No:");
        int a=sc.nextInt();
        System.out.println("Enter the Second No:");
        int b=sc.nextInt();
        int prod=a*b;
        System.out.println("The Product Of These Numbers is:"+prod);
        sc.close();
    }    
}
