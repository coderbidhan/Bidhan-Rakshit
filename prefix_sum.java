public class prefix_sum {
    public static void sum(int arr[]){
        int currsum;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=i==0 ?prefix[j]:prefix[j]-prefix[i-1];
                if(currsum>max){
                    max=currsum;
                }
                if(currsum<min){
                    min=currsum;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }    
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        sum(number);
    }
}
