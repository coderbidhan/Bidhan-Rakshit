public class prac100{
    public static void largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int arr[]={10,20,4};
        largest(arr);
    }
}