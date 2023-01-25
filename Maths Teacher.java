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
       int tc =sc.nextInt();
       for(int i=0;i<tc;i++){
           
     int n = sc.nextInt();
    
     String s1 =sc.nextLine();
     String s2 =sc.nextLine();
     System.out.println(call(s1,s2,n)); 
      
  }
  
  }
  
   public static String call(String s1,String s2,int n){
            
            
       Map<Character,Integer> news =new LinkedHashMap<>();
       Map<Character,Integer> mess =new LinkedHashMap<>();
            
            
        //  System.out.println(s1[1]);
        // char[] s11 = s1.toCharArray();
        // char[] s22 = s2.toCharArray();
            
            
         for(int i=0;i<s1.length();i++){
             if(news.containsKey(s1.charAt(i))){
                 news.put(s1.charAt(i),news.get(s1.charAt(i))+1);
             }else{
                 news.put(s1.charAt(i),1);
             }
         }
         
         for(int i=0;i<s2.length();i++){
             if(mess.containsKey(s2.charAt(i))){
                 mess.put(s2.charAt(i),mess.get(s2.charAt(i))+1);
             }else{
                 mess.put(s2.charAt(i),1);
             }
         }
         
         
        //  System.out.println(mess+" "+news);
         
          if( news.size() != mess.size()){
                 return "Not Equivalent";
             }
             
         for(int i=0;i<mess.size();i++){
             if(news.get(i)  !=  mess.get(i)){
                 return "Not Equivalent";
             }
         }
       return "Equivalent";
   }
}





















