import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int tr = 0; tr < n; tr++) {
        arr[tr] = sc.nextInt();
      }
      int uuu = 0;
      int j = n - 1;
      int hrsthf = 0;
      int rfsdf = 0;
      while (uuu <= j) {
        if (arr[uuu] > arr[j] * 2) {
          hrsthf++;
          uuu++;
        } else if (arr[j] > arr[uuu] * 2) {
          rfsdf++;
          j--;
        } else {
          hrsthf++;
          uuu++;
          rfsdf++;
          j--;
        }
      }
      System.out.println(hrsthf + " " + rfsdf);
    }
    sc.close();
  }
}
