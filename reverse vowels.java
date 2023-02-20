import java.util.*;
import java.io.*;
public class Main {
  
     static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;
    public FastReader()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
      while (st == null || !st.hasMoreElements()){
        try { st = new StringTokenizer(br.readLine()); }
        catch (IOException e) { e.printStackTrace(); }
      }
      return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble(){ return Double.parseDouble(next()); }
    String nextLine(){
      String str = "";
      try { str = br.readLine(); }
      catch (IOException e) { e.printStackTrace(); }
      return str;
    }
  }
  
  
  public static void main(String[] args) {
    Scanner cscs = new Scanner(System.in);
    int t = cscs.nextInt();
    cscs.nextLine();
    while (t-- > 0) {
      String s = cscs.nextLine();
      char[] rrrr = s.toCharArray();
      int ii = 0;
      int tyt = rrrr.length - 1;
      while (ii < tyt) {
        if (callWala(rrrr[ii]) && callWala(rrrr[tyt])) {
            
            
          char temp = rrrr[ii];
          
          rrrr[ii] = rrrr[tyt];
          
          rrrr[tyt] = temp;
          
          ii++;
          
          tyt--;
          
        } else if (callWala(rrrr[ii])) {
          tyt--;
        } else if (callWala(rrrr[tyt])) {
          ii++;
        
            
        }
        else {
            
          ii++;
          tyt--;
          
        }
      }
      System.out.println(new String(rrrr));
    }
    cscs.close();
  }

  public static boolean callWala(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
  }
}
