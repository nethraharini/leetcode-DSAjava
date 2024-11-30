class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int closest = nums[0];
        for(int num : nums){
            if (Math.abs(num) < Math.abs(closest) || 
               (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num;
        } 
        
        
        } return closest;
    }
}

/*
Input
nums =
[-4,-2,1,4,8]
Output
1*/
