
package Question4;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 7}, 
                                          {3, 6, 9},
                                          {5, 3, 8}};
        
        System.out.println("3 by 3 Matrix");
        for(int[]x:matrix) {
            for(int y: x) {
                System.out.print(y+ " ");
            }
            System.out.println("");
        }
        
        int[][] list = new int[3][3];
        System.out.println("After rotates 90 degrees clockwise");
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[i].length; j++) {
                list[j][2-i] = matrix[i][j];
            }
        }
        
         for(int[]x:list) {
            for(int y: x) {
                System.out.print(y+ " ");
            }
            System.out.println("");
        }
    }
}
