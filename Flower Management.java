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
   public static void call(int[] a , int k,int n){
       
       int c=0;
       
       for(int i=0;i<a.length && c < n;i++){
           if(a[i]==0){
               int p = (i==0) ? 0: a[i-1];
               int ne = (i==a.length-1) ? 0 : a[i+1];
               if(p==0&& ne==0 ){
                   a[i]=1;
                   c++;
               }
           }
       }
       
       if(c==n){
           System.out.println("Yes");
           
       }else{
             System.out.println("No");
           
       }
       
   }
  
  public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int j=0;j<t;j++){
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      
      for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
      }
      call(a,n,k);
}
  }
}

















 




