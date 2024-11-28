class Solution {
    public int[][] transpose(int[][] matrix) {
       
        int rows = matrix.length;
        int cols = matrix[0].length; 
      /* since in some matrix can be imbalanced like, 
      2 * 3 matrix , it won't take all lengths plainly so with index we can locate column length*/
        int[][] transpose = new int [cols][rows];
        
        
        for(int i=0;i<rows;i++){

            for(int j = 0; j<cols; j++){
                transpose[j][i] = matrix[i][j];
                
            }
        }
        for(int i = 0; i<cols; i++){
            for(int j = 0; j<rows; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }return transpose;
      
    }
}

/*matrix =
[[1,2,3],[4,5,6]]
Stdout
1 4 
2 5 
3 6 
Output
[[1,4],[2,5],[3,6]]*/
