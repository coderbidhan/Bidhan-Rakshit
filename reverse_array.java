public class reverse_array {
    public static void reverse(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int values[]={12,9,5,0,4};
        reverse(values);
        for (int i=0;i<values.length;i++){
            System.out.print(values[i]+" ");
        }
    }
}
