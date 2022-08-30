public class pair_array {
    public static void pair(int marks[]){
        int total=0;
        for(int i=0;i<marks.length;i++){
            // System.out.print("("+marks[i]+",");
            for (int j=i+1;j<marks.length;j++){
                System.out.print("("+marks[i]+","+marks[j]+")");
                total++;
            }
            
            System.out.println();
            

        }
        System.out.println(total);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,5};
        pair(numbers);
    }
}
