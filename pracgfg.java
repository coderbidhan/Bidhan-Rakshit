//import java.util.*;
public class pracgfg{
    public static int linerSearch(int numbers[]){
        int largest =Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={12,45,37,807,34,89};
        //int key=89;
        int index=linerSearch(numbers);
        // if(index==-1){
        //     System.out.println("Invalid input");
        // }else{
            System.out.println("max "+index);            
    
    }
}