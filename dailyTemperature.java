class Solution {
    public int[] dailyTemperatures(int[] a) {
int n = a.length;
int[] ans =new int[n];
        for(int i=0;i<n;i++){

 boolean b = false;
int c=1;
            for(int j=i;j<n;j++){

                   

                if(i != j)
                {
                    
                    if(a[i]<a[j])   { ans[i] = c; 
                    b=true;
                    break;
                    } 
                    else c++;

                }
                if(!b)  ans[i]=0;

            }

           
        }
         return ans;
    }
}
