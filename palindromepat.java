public class palindromepat {
    public static void main(String args[]){
        palindrome(5);
    
    }
    public static void palindrome(int n){
        //outer  loop
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers --> what to print!
            //decending
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            //assending
            for(int j=2;j<=i;j++){
                System.out.print(j);                
            }
            System.out.println();
        }
    }
}