class Solution {
    public int minMaxGame(int[] nums) {
          while(nums.length>1){
           int n = nums.length/2;
           int [] newNums = new int[n];

           for(int i=0;i<n;i++){
            if(i%2==0){
                newNums[i] = Math.min(nums[2*i],nums[2*i+1]); 
                }
            else{
                newNums[i] = Math.max(nums[2*i],nums[2*i+1]);
               }
         }
            nums = newNums;   //append all nums to newNums
          }
    
      return nums[0];
    
}
}

/* nums =
[1,3,5,2,4,8,2,2]
Output
1
*/
