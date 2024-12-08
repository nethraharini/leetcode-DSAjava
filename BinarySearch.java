class Solution {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            
        } return -1;
    }
}

/*
nums =
[-1,0,3,5,9,12]
target =
9
Output
4
*/
