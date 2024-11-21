class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int totalSum = n * (n+1)/2;

       int arraySum =0;
       for(int num : nums){
         arraySum+=num;
       }
    return totalSum - arraySum;
}
}

// input
// [3,0,1]
//output
//2
