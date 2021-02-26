class Practice {
  public static int[][] getIdentityMatrix(int n){
    int[][] idMat = new int[n][n];
    for(int row = 0; row < n; row++){
      for(int col = 0; col < n; col++){
        if(row == col){
          idMat[row][col] = 1;
        }
        else{
          idMat[row][col] = 0;
        }
      }
    }
    return idMat;
  }
}