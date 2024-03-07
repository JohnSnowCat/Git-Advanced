public class Main {
private static int n = 5;
private static int m = 5;

  public static void main(String[] args) {
    System.out.println("Hello GIT");
    fillMatrix(n, m);
    System.out.println("String 1");
    System.out.println("String 2");
  }

  public static void fillMatrix(int n, int m) {
    String array[][] = new String[n][m];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        array[i][j] = "+";
        System.out.print(array[i][j] + " ");
      }
      System.out.println("\n");
    }
  }
}