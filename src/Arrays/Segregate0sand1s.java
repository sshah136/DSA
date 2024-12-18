package Arrays;

public class Segregate0sand1s {
    void segregate0and1(int[] arr) {
        // code here

        int l = 0;
        int r = arr.length-1;

        int temp = 0;

        while (l < r){
            if (arr[l] == 0){//all the left will contain 0 so no need to change
                l++;
            } else {
                temp = arr[r];
                arr[r--] = arr[l];
                arr[l] = temp;
            }
        }
    }
}
