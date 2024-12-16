package Arrays;

/*

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
*/

public class SortedArraySquareLC977 {
    public int[] sortedSquares(int[] nums) {
        int l = 0; //left pointer
        int r = nums.length - 1; // right pointer
        int[] sortedArray = new int[nums.length];

        //As this is a sorted array, with positive and negative values, the lowest square value will be in the
        // middle surrounded by higher squares. Eg: -4,0,1

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                sortedArray[i] = nums[l] * nums[l];
                l++;
            } else {
                sortedArray[i] = nums[r] * nums[r];
                r--;
            }
        }
        return sortedArray;
    }

}
