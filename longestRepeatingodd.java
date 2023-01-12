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
  
  public static void call(int[] a ,int n){
     
     
     int max =0;
     
     for(int i=0;i<n;i++){
         if(a[i]%2==0) continue;
         int l=i;
         int c=0;
        while(   l<n  && a[i]==a[l] ){
             c++;
             l++;
         }
         if(c>max){
             max =c;
         }
     }
     System.out.println(max);
}
      

  public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     
      int[] a = new int[n];
       
      for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
      }
     
      call(a,n);
}
  
}
