// Given n non-negative integers representing an elevation map where the width of each bar is 1, 
// compute how much water it can trap after raining.

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

// Time complexity : O(n)
// Space Complexity : O(n) + O(n)
class Solution {
    
    public int trap(int[] height) {
        
        int n = height.length, ans = 0, i;
        
        // store left max for every elevation map in array
        // store -1 if rain water can't trapped by any elevation map, else store max 
        int[] left = new int[n];
        left[0] = height[0];
        for(i = 1; i < n; i++)
            left[i] = Math.max(left[i-1], height[i]);
        
        // store right max for every elevation map in array
        int[] right = new int[n];
        right[n-1] = height[n-1];
        for(i = n-2; i >= 0; i--)
            right[i] = Math.max(right[i+1], height[i]);
        
        // compare left and right max for every elvation map
        // for ith elevation map trapped water will be min(leftmax, rightmax)-height[i]
        for(i = 0; i < n; i++)
            ans += Math.max(0, Math.min((left[i]-height[i]), (right[i]-height[i])));
        
        return ans;
    }
}
