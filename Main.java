public class Main {
private int n = 5;
private int m = 5;

  public static void main(String[] args) {
    System.out.println("Hello GIT");
  }

  public void fillMatrix(int n, int m) {
    int array[][] = new int[n][m];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        array[n][m] = 0;
        System.out.println(array[n][m]);
      }
      System.out.println("\n");
    }
  }
}