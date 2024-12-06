class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=0;i<nums.length-1;i++)
           {
                if(nums[i]>nums[i + 1]){
                    increasing = false;
                    
                }
                if(nums[i]<nums[i+1]){
                    decreasing = false;
                }
           }
        return increasing || decreasing;
    }
}


/* 
input = [1,3,2]
output
  false
  {reason : cause 1<3 , 3<2 , no its nor increasing nor decreasing}
*/
