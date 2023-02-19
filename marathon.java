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
      int c=0;
      int sp=0;
      
      int energy = 0;
      
      boolean b = false;    
       Scanner sc = new Scanner(System.in);
       
       int tc  = sc.nextInt();
       
       for(int i=0;i<tc;i++)
       {
            energy = energy+sc.nextInt();
       
            int dis = sc.nextInt();
            c = c + 1;
            int re = energy - dis ;
       
              if(re<0) {
                     sp = c ;
       
                     energy = 0 ;

       }
       
       else{ energy = energy - dis;
       
           b=true;
       }

       }
       if(!b){
             System.out.println("No starting points");
       }
       else
       {
       System.out.println(sp);
           
           
       }  
      
  }
}
