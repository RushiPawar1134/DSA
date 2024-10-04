import java.util.*;

public class TrappingRainwater{
 // Auxiliary arrays are used to solve 
// Width=1 ; Height of Bar = x ; Height of Water Trap = w;
//Amount of water trapped = (w - x) * width
// Min of bars > 2
// No water trapped if bars in ascending or descending order
// Water trapped = minimum of (max left boundary,max right boundary)

    public static int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=height[0];
        for(int i=1; i<n; i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int ans=0;
        for(int i=0; i<n; i++){
            ans=ans+(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
        
    }
}
  public static void main(String args[]) {
      int height[] = {4,2,0,6,3,2,5};
      
  }
