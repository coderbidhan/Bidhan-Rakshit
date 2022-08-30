import java.util.*;
public class circleArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Redious Of The Circle:");
        float rad=sc.nextFloat();
        float pie=3.14f;
        float area=pie*rad*rad;
        System.out.println("The Area Of The Circle Is:"+area);
        sc.close();
    }
    
}
