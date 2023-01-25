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
       FastReader sc = new FastReader();
      int n = sc.nextInt();
      int k = sc.nextInt();
     
     String s1 =sc.nextLine();
     String s2 =sc.nextLine();
      System.out.println(call(s1,s2,n,k)); 
  }
  
  
   public static String call(String s1,String s2,int n,int k){
       
       Map<String,Integer> news =new HashMap<>();
         Map<String,Integer> mess =new HashMap<>();
         
        //  System.out.println(s1[1]);
        String[] s11 = s1.split(" ");
        String[] s22 = s2.split(" ");
    
         for(int i=0;i<s11.length;i++){
             if(news.containsKey(s11[i])){
                 news.put(s11[i],news.get(s11[i])+1);
             }else{
                 news.put(s11[i],1);
             }
         }
         
         for(int i=0;i<s22.length;i++){
             if(mess.containsKey(s22[i])){
                 mess.put(s22[i],mess.get(s22[i])+1);
             }else{
                 mess.put(s22[i],1);
             }
         }
         
         
        //  System.out.println(mess+" "+news);
         
         for(int i=0;i<mess.size();i++){
             if(!news.containsKey(mess.get(i))){
                 return "No";
             }else{
                 if(mess.get(i)!=news.get(mess.get(i))){
                      return "No";
                 }
             }
         }
       return "Yes";
   }
}





















