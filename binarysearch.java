public class binarysearch {
    public static int search(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start <=end){
            int mid=(start+end)/2;
            //comparision
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]>key){//left array
                end=mid-1;
            }else{//right array
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={12,23,63,84,100};
        int key=100;
        System.out.println(search(numbers, key));
    }
}
