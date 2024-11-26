/*
Input
nums =
[3,2,3]
Output
3
Expected
3
  */


// method 1 hashmap divide & conquer 

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        // Create a hashmap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array and count the occurrences of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find the element whose count is greater than n / 2
        int n = nums.length;
        for (int num : map.keySet()) {
            if (map.get(num) > n / 2) {
                return num;
            }
        }
      
        return -1; 
    }
}

// method 2 The Boyer-Moore Voting Algorithm works by maintaining a potential candidate for the majority element and a count that tracks the level of support the candidate has.
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1; // Adjust count based on whether the number matches the candidate
        }
        
        return candidate; // candidate will be the majority element
    }
}
