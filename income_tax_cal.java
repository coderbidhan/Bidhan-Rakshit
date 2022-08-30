import java.util.*;
public class income_tax_cal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income:");
        int income = sc.nextInt();
        if (income<500000){
            System.out.println("Your Tax Is :"+ 0 +" Rupees");
        }else if (income>=500000 && income <=1000000){
            int tax = income*20/100;
            System.out.println("Your Tax Is :"+ tax +" Rupees");
        }else{
            int tax= income*30/100;
            System.out.println("Your Tax Is :"+ tax +" Rupees");
        }
        sc.close();
    }
}