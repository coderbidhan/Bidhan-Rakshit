public class check_prime {
    public static void main(String args[]){
        int n=5;
        int div=2;
        while (div<n){
            if (n%div==0){
                System.out.println("NON PRIME!");
                break;
            }
            else{
                div=div+1;
            }
            
        }
        if(div==n){
            System.out.println("PRIME!");
        }
    }
    
}
