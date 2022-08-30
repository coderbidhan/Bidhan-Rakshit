public class sub1 {
    public static void sub(int numbers[]){
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int curr= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(curr>max){
                    max=curr;
                }
            }
            //System.out.println();
        }
        System.out.println("Max of Subarray Sum is:"+max);
    }
    public static void main(String args[]){
        int numbers[]={2,5,6,8,4,10};
        sub(numbers);
    }
}
