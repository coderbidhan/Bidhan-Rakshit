public class auxilaryarray {
    public static int trappedRainwater(int height[]){//time complexity is O(n).
        int n=height.length;
        int trappedWater=0;
        //calculate left max boundary
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //loop
        for(int i=0;i<n;i++){
            //calculate waterlevel
            //waterlevel = min(leftmax[i],rightmax[i])
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //calculate trapped water
            //trapped water =waterlevel -height[i]
            trappedWater +=waterlevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }   
}
