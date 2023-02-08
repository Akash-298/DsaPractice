class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] res=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
               res[k]=nums1[i];
               k++;
               i++;
            }
            else if(nums2[j]<nums1[i]){
                res[k]=nums2[j];
                k++;
                j++;
            }
            else{
                res[k]=nums1[i];
                k++;
                i++;
                res[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            res[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n2){
            res[k]=nums2[j];
            k++;
            j++;
        }
        int mid=res.length/2;
        if(res.length%2==0){
            return (double)(res[mid-1]+res[mid])/2;
        }
        return (double)res[mid];
    }
}
