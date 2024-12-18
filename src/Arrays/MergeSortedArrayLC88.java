package Arrays;

public class MergeSortedArrayLC88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;


        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--] = nums1[i--];// break condition using decrement operator
            }else{
                nums1[k--] = nums2[j--];// break condition using decrement operator
            }
        }

        while(i>=0){// All elements of nums2 have been added
            nums1[k--] = nums1[i--];
        }

        while(j>=0){// All elements of nums1 have been added
            nums1[k--] = nums2[j--];

        }
    }
    // 2nd approach

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;

        while(k>=0){
            if(j<0){
                break;
            }
            if(i>=0 && nums1[i] >= nums2[j]){ // 'i' cannot reach <0 before k. even if nums1[i] will be exhausted,
                // it'll stay at 0 till nums2[j] is completed
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
