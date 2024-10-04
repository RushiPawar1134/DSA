//Brute Force Time Complexity = O(n*n*n)
public class Maxsubarraysum{
  public static void maxSubarraySum(int numbers[]){
    int currsum = 0;
    int maxSum = Integer.MIN_VALUE;


    for (int i=0; i<numbers.length; i++){
      int start = i;
      for(int j=i; j<numbers.length; j++){
        int end = j;
        currsum = 0;
        for (int k=start; k<=end; k++){
          // System.out.print(numbers[k] + " ");
          // Subarray sum
          currsum += numbers[k]; 
        }
        System.out.println(currsum);
      if(maxSum < currsum){
        maxSum = currsum;
      }
      
      }
     
    }
    //System.out.println("Total Subarrays ="+ts);
    System.out.println("Max Sum = "+ maxSum);
  }

  public static void main(String args[]) {
  int numbers[] = {1,-2,6,-1,3};    
  maxSubarraySum(numbers);
  }
}