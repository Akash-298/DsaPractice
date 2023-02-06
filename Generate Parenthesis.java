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
      int n = sc.nextInt();
      
     List<String> s1 =   call(n);
     for(int i=0;i<s1.size();i++){
         System.out.print(s1.get(i)+" ");
     }
       System.out.println();
  }
  
   public static List<String>  call(int n){
       List<String> re = new ArrayList<>();
       d(n,n,re,"");
       return re;
       
   }
   
      public static  void d(int l,int r ,List<String> re ,String s){
          
          if(l==0  && r==0 ) re.add(s);
          else{
              if(l>0) d(l-1,r,re,s+"(");
              if(r>l)  d(l,r-1,re,s+")");
          }
      }
   
}


















