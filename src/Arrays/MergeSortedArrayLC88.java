package Arrays;

public class MergeSortedArrayLC88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;


        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        while(i>=0){// All elements of nums2 have been added
            nums1[k--] = nums1[i--];
        }

        while(j>=0){// All elements of nums1 have been added
            nums1[k--] = nums2[j--];
        }
    }
}
