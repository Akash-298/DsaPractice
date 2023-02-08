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
 
      
   Scanner sc = new Scanner(System.in);
          int k = sc.nextInt();
   for(int kk=0;kk<k;kk++){
      int n = sc.nextInt();
    
      int[] a = new int[n];
      
      for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
      }
     int[] ans= callWala(a,n);
for(int j=0;j<n;j++){
      System.out.print(ans[j]+" ");
            
        }
          System.out.println();
}
  }
       public static int[] callWala(int[] a , int n){
        int[] ans = new int[n];
        Stack<Integer> st =new Stack<>();
        
        for(int i=0;i<n;i++){
            
            
            while(!st.empty() && a[i]>=a[st.peek()] ){
                st.pop();
            }
            if(st.empty()){
                ans[i]=i+1;
            }else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
      
        // for(int t=0;t<n;t++){
        // System.out.print(ans[t]+" ");
            
        // }
        //   System.out.println();
        return ans;
    }
  }
