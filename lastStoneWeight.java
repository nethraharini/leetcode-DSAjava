import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {
        // Continue smashing stones until only one or none are left.
        while (stones.length > 1) {                                         
            // Sort the array to find the two heaviest stones.
            Arrays.sort(stones);                                                   //sorts = [ 1,1,2,4,7,8]

            // Take the two heaviest stones.
            int stone1 = stones[stones.length - 1]; // Largest stone              takes 7
            int stone2 = stones[stones.length - 2]; // Second largest stone     takes 8

            // If the stones are not equal, calculate the remaining weight.
            if (stone1 != stone2) {                  
                int newStone = stone1 - stone2;                                // 8-7 = 1 , so arrays = [1,1,2,4,1], after sort = [1,1,1,2,4]

                // Replace the last two stones with the remaining one and reduce array size.
                stones = Arrays.copyOf(stones, stones.length - 1);             //  reduces array size and length to 1
                stones[stones.length - 1] = newStone;
            } else {
                // If the stones are equal, remove both.
                stones = Arrays.copyOf(stones, stones.length - 2);           // if both equal reduce both stones from array
            }
        }

        // If there are no stones left, return 0, otherwise return the last stone.
        return stones.length == 0 ? 0 : stones[0];                          // checks if the length ==0 if it is then i return 0 index
    }
}


/*Input
stones =
[2,7,4,1,8,1]
Output
1*/
