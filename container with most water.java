class Solution {
    public int maxArea(int[] a) {

        int max = 0;

        int i=0;
        int j=a.length -1;

        while(i<j){
            int area = Math.abs(i-j)*Math.min(a[i],a[j]);
            if(area>max)    max = area;

            if(a[i]>a[j]){
                j--;

            }else if(a[i]<a[j]) i++;

            else{
                i++;
            }


        }
return max;
    }
}
