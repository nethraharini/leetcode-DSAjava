// [1 0 0 0 1] , 1 is not empty , 0 is empty , while we need to place flowers, if it is empty and we check left position and right position if left is not empty then can't flower  adjacent
// [1 1 0 1] this is wrong since left is not empty , we can only place plan if left and right is empty 
// [ 1 0 1 0 1] this is right method since left is empty and right is empty and current position too
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
              boolean leftEmpty = (i==0 || flowerbed[i-1]==0);
              boolean rightEmpty = (i==flowerbed.length-1 || flowerbed[i+1]==0);
            
            if(leftEmpty && rightEmpty){
                flowerbed[i] =1;
                n-- ;
                if(n==0){
                    return true;
                }
            }
            }
              
        }return n<=0;
    
    }
}
/*
flowerbed =
[1,0,0,0,1]
n =
2
Output
false
  */
