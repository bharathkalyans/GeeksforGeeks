class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null) return nums;
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int low, int high){
        if(low < high){
            int mid = (low + high)/2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            mergeArray(nums, low, mid, high);
        }
    }

    private void mergeArray(int[] nums, int low, int mid, int high){
        int l = mid - low + 1, r = high - mid;
        int[] left = new int[l];
        int[] right = new int[r];
        for(int i = 0; i < l; i++)
            left[i] = nums[low + i];
        for(int j = 0; j < r; j++)
            right[j] = nums[j + mid + 1];
        
        int i = 0, j = 0, k = low;
        while(i < l && j < r){
            if(left[i] <= right[j]){
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while(i < l)
            nums[k++] = left[i++];
        
        while(j < r)
            nums[k++] = right[j++];

    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        Solution m = new Solution();
        System.out.println("-----------Merge Sort-------------");
        int[] a={-1,-204,23,90,455666,1,0,23,23,45,54,23,10000};
        m.sortArray(a, 0 , a.length - 1);
        m.printarray(a);
    }

}

