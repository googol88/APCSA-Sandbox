import java.util.Arrays;

class Practice {
  public static int[][] getIdentityMatrix(int n){
    /*int[][] idMat = new int[n][n];
    for(int row = 0; row < n; row++){
      for(int col = 0; col < n; col++){
        if(row == col){
          idMat[row][col] = 1;
        }
        else{
          idMat[row][col] = 0;
        }
      }
    }*/
    int[][] idMat = new int[n][n];
    for(int row = 0; row < n; row++){
      idMat[row][row] = 1;
    }
    return idMat;
  }

  public static int getLargestSquare(int[][] nums) {
		int sqrt, n;
		int maxSq = -1;
		for(int row = 0; row < nums.length; row++) {
			for(int col = 0; col < nums[row].length; col++) {
				n = nums[row][col];
				sqrt = (int) Math.sqrt(n);
				if(sqrt*sqrt == n && n > maxSq) {
					maxSq = n;
				}
			}
		}
		
		return maxSq;
	}

  public static double calcColumnAve(int[][] numGrid, int col){
    int total = 0;
    for(int row = 0; row < numGrid.length; row++) {
      total += numGrid[row][col];
    }
    return (double) total/numGrid.length;
  }

  public static void main(String[] args) {
    int[][] matrix = getIdentityMatrix(8);
    for(int[] row : matrix) {
      System.out.println(Arrays.toString(row));
    }
    int[][] squares = {{23, 25, 80}, {-144, -153, 34}, {1, 2, 3}};
    System.out.println(getLargestSquare(squares));
    System.out.println((int) Math.sqrt(-4));

    int[][] numGrid = {
      {1, 5, 3, 6, 7},
      {9, 2, 2, 0, 4},
      {0, 1, 5, 1, 1},
      {4, 4, 4, 5, 2},
      {2, 4, 5, 3, 0}
    };
    System.out.println(calcColumnAve(numGrid, 1));
  }
}