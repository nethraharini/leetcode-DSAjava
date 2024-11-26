class Solution {
    
    public int removeElement(int[] nums, int val) {
        int count = 0;
         for(int i=0;i<nums.length;i++){
           if (nums[i] !=  val){
            nums[count] = nums[i];
            count++;  
            System.out.println(Arrays.toString(nums));
           }   
         }
         return count;
         
    }
}

    
    
/*
nums =
[3,2,2,3]
val =
3
Stdout
[2, 2, 2, 3]
[2, 2, 2, 3]
Output
[2,2]
*/
