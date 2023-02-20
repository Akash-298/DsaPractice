import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // HashMap<String, Integer> map = new HashMap<>();
        // ArrayList<String> l1 = new ArrayList<>();
        // ArrayList<Integer> l2 = new ArrayList<>();
        
        String[] l1 = new String[n];
        int[] l2 = new int[n];
        
        for(int i=0;i<n;i++)
        {
            l1[i]=(sc.next());
            l2[i]=(sc.nextInt());
        }
        
         for(int i=0;i<n-1;i++)
         {
             for(int j=0;j<n-i-1;j++)
             {
                 if(0<l1[j].compareTo(l1[j+1]))
                 {
                    String t = l1[j];
                    l1[j]=l1[j+1];
                    l1[j+1]=t;
                    
                    
                      int t1 = l2[j];
                    l2[j]=l2[j+1];
                    l2[j+1]=t1;
                    
                 }

             }
         }
          for(int i=0;i<n-1;i++)
         {
             for(int j=0;j<n-i-1;j++)
             {
                 if(l2[j]<(l2[j+1]))
                 {
                    String t = l1[j];
                    l1[j]=l1[j+1];
                    l1[j+1]=t;
                    
                    
                      int t1 = l2[j];
                    l2[j]=l2[j+1];
                    l2[j+1]=t1;
                    
                 }

             }
         }
              int rank = 1;
        for (int i = 0;i< n; i++) 
        {
            if (i > 0 && l2[i] < l2[i-1])
                rank=i+1;
            System.out.println(rank +" "+l1[i]);
        }
      
   
    }
    

}


