//Enter code here
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
        int re=0;
        
        
        Scanner sc=new Scanner(System.in);
       
            int n=sc.nextInt();
            
            
            sc.nextLine();
            
            
            String[] t1=sc.nextLine().split(" ");
            String[] t2=sc.nextLine().split(" ");
           
            
            int[] e1=new int[t1.length];
            
            int[] arr2=new int[t2.length];
            
            
            for(int i=0;i<t1.length;i++)
            
            {
                e1[i]=Integer.parseInt(t1[i]);
            }
            
            
            for(int i=0;i<t2.length;i++)
            {
                arr2[i]=Integer.parseInt(t2[i]);
            }
          
            callWala(e1,arr2,n);
        
    }
    
    
public static void callWala(int[] e1, int[] arr2,int n)
    {
        
        
        Arrays.sort(arr2);
        
        
        Arrays.sort(e1);
         
       
         int p=0;
         int q=0;
         int a=0;
         int rr=0;
         
         
         while(p<e1.length && q<arr2.length){
             if(e1[p]<=arr2[q]) {
                 a++;
                 p++;
             }
             else
             
             
             {
                 a--;
                 q++;
             }
            rr= Math.max(rr,a);
         }
       
        if(rr<=n)
        {
            System.out.println("Possible");
        }
        else{
            System.out.println("Not Possible");
        }
        
    }
}
