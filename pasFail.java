import java.util.*;

public class pasFail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter Your Marks:");
        int marks = sc.nextInt();
        String result = (marks >= 33 && marks < 100) ? "PASS" : "FAIL";
        System.out.println(result);
        sc.close();
    }
}