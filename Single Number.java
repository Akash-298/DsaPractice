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
   public static int call(int[] nums){
       
       if(nums.length == 1) {
            return nums[0];
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            }
            else {
                set.remove(nums[i]);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        Integer singleOne = iterator.next();
        return singleOne;
       
   }
  
  public static void main(String[] args){
      
      
   Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    for(int j=0;j<k;j++){
      int n = sc.nextInt();
     
      int[] a = new int[n];
      
      for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
          
      }
      
       System.out.println(call(a));  
    }
      
   
  }
}






















