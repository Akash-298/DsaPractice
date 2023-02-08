import java.util.*;
import java.io.*;
class Main{
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
  public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
   int k = sc.nextInt();
   for(int kk=0;kk<k;kk++){
      int n = sc.nextInt();
    
      int[] a = new int[n];
      
      for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
      }
      
     callWala(a,n);

      
  }
}

 public static void callWala(int[] a,int n){
     
     int t=0;
     for(int i=0;i<n;i++){
         if(a[i]!=a[t]){
             int te = ++t;
             a[te] = a[i];
         }
     }
     
     System.out.println(t+1);
     for(int i=0;i<=t;i++){
             System.out.print(a[i]+" ");
     }
         System.out.println();
 }
 
}



















