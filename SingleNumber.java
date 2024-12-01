// method 1 sorting and looping

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        // The unique number is the last one
        return nums[nums.length - 1];
    }
}


//method 2 hashset

import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        // The single number is the only element in the set
        for (int num : set) {
            return num;
        }
        return -1; // Should not reach here for valid input
    }
}


//method 3  bitwise operations

class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int i=0;i<nums.length;i++){
            {
                result = result^nums[i];
            }
            
            
            
            }return result;
        }
    }

/* 
input 
  [2,2,1]
  ouput
  1
  */

