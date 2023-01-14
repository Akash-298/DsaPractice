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
   public static String call(String m,String str){
       
    //   System.out.println(n+" "+str);
    
    int n = Integer.parseInt(m);
    
    StringBuffer left =new StringBuffer("");
     StringBuffer right =new StringBuffer("");
    
    if(str.length()<=2){
        return str;
        
    }
    
    int mid = (n-1)/2;
    
    for(int j=0;j<mid;j++){
        
        left.append(str.charAt(j));
        
    }
     for(int k=(mid+1);k<n;k++){
         
        right.append(str.charAt(k));
        
    }
    
     StringBuffer ans =new StringBuffer("");
    
    
    ans.append(str.charAt(mid)) ;
    
    
    ans.append(call(Integer.toString(left.length()),left.toString()));
     ans.append(call(Integer.toString(right.length()),right.toString()));
    
    
    return ans.toString();
        
       
   }
  
  public static void main(String[] args){
      
      Scanner sc= new Scanner(System.in);
      
      int tc = sc.nextInt();
      sc.nextLine();
      for(int i=0;i<tc;i++){
          String n =sc.nextLine();
          String str=sc.nextLine();
          System.out.println(call(n,str));
      }
  }
}
