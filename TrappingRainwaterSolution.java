public class TrappingRainwaterSolution {  // Define the Solution class
    public int trap(int[] height) {  // Define the trap method taking an array of integers
        int n = height.length;  // Get the length of the input array
        if (n == 0) return 0;  // If the array is empty, return 0

        int[] leftMax = new int[n];  // Create an array to store the left maximum heights
        int[] rightMax = new int[n];  // Create an array to store the right maximum heights

        leftMax[0] = height[0];  // Initialize the left maximum with the first height
        for (int i = 1; i < n; i++) {  // Loop through the array
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);  // Calculate the left maximum for each position
        }

        rightMax[n - 1] = height[n - 1];  // Initialize the right maximum with the last height
        for (int i = n - 2; i >= 0; i--) {  // Loop through the array in reverse
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);  // Calculate the right maximum for each position
        }

        int waterTrapped = 0;  // Initialize the variable to store the trapped water
        for (int i = 0; i < n; i++) {  // Loop through the array
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];  // Calculate the trapped water at each position
        }

        return waterTrapped;  // Return the total trapped water
    }

    public static void main(String[] args) {  // Main method
        TrappingRainwaterSolution solution = new TrappingRainwaterSolution ();  // Create an instance of the Solution class
        System.out.println(solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));  // Output: 6
        System.out.println(solution.trap(new int[]{3,1,2,4,5}));  // Output: 0
        System.out.println(solution.trap(new int[]{}));  // Output: 0
        System.out.println(solution.trap(new int[]{5}));  // Output: 0
        System.out.println(solution.trap(new int[]{0, 1000000000, 0, 1000000000, 0}));  // Output: 0
    }
} 
