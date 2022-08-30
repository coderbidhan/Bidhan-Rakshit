public class subarray {
    public static void printsub(int number[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        //int subsum=0;
        //int ts=0;
        for (int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                int c=0;
                for (int k=i;k<=j;k++){
                                        
                    c =c + number[k];
                           
                }
                System.out.println(c);                    
                if(c>max){
                    max=c;
                }
                if(c<min){
                    min=c;
                }            
                
                //ts++;
                
            }
            
        }
        
        System.out.println("Maximum Sum Of Subarray in the list is :"+max);
        System.out.println("Minimum Sum Of Subarray in the list is :"+min);
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        printsub(number);
    }
}
