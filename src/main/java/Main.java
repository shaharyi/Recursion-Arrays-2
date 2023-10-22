class Main {
  public static void main(String[] args) {
    int[] a = new int[] { 5, 8, 1, 5, 9, 2 };

    int m = findMax(a);    
    System.out.println(m);
  }

  public static int findMax(int[] a) {
    return findMaxR(a, a.length - 1);
  }

  public static int findMaxR(int[] a, int n) {
    /********* EDIT THIS CODE **********/
    return a[0];
  }
  
  public static int findMin(int[] a) {
    return findMinR(a, a.length - 1);
  }
  
  public static int findMinR(int[] a, int n) {
    /********* EDIT THIS CODE **********/
    return a[0];
  }
}
