class Main {
  public static void main(String[] args) {
    int[] a = new int[] { 5, 8, 1, 5, 9, 2 };

    int m = product(a, a.length - 1);    
    System.out.println(m);
    
    double av = average(a, a.length - 1);    
    System.out.println(av);

    q31(a, a.length - 1);

    q32(a, a.length - 1);

    int[][] m = { { 4, 2, 6 }, 
                  { 7, 1, 2 },
                  { 3, 6, 1 } };
    
    q33(m, 0, 0);
    
    q34(m, 0);
  }

  public static int product(int[] a, int n) {
    /********* EDIT THIS CODE **********/
    return a[0];
  }
  
  public static double average(int[] a, int n) {
    /********* EDIT THIS CODE **********/
    return a[0];
  }

  /*
   * Print values at even indexes: 0, 2, 4, ...
   */
  public static void q31(int[] a, int n) {
    /********* EDIT THIS CODE **********/
    return a[0];
  }
  
  /*
   * Print values smaller than their following one:
   * 5, 9, 3, 7 -> print 5, 3
   */
  public static void q32(int[] a, int n) {
    /********* FILL IN HERE **********/
  }

  /*
   * Print matrix row by row
   */
  public static void q33(int[][] a, int i, int j) {
    
    // if passed last row
    if (i == a.length)    
      return;

    // if reached end of current row
    if (j == a[i].length) {    
      System.out.println();
      q33(a, i+1, 0);
    }    
    
    System.out.print(a[i][j] + ", ");

    // do next column
    q33(a, i, j+1);
  }
  
  /*
   * Print max value in each row
   */
  public static void q34(int[][] a, int i) {
    /********* FILL IN HERE **********/
  }
  
}
