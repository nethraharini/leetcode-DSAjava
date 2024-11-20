class Solution {
    public int[] twoSum(int[] nums, int target) {
      
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j}; 
            }
        }
    }
    throw new IllegalArgumentException("No solution found");
}

    }


// target = 9
// sum of first 2 array integers  = 7+2 =9
// output = 9
