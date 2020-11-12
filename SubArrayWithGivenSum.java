public class SubArrayWithGivenSum {

    public static boolean isSum(int[] arr,int sum,int n){

        for (int i=0;i<n;i++){
            int curr_sum=0;

            for (int j=i;j<n;j++){
                curr_sum += arr[j];
                if(curr_sum ==  sum)
                    return true;
            }
        }
        return false;
    }//O(n^2)




    public static void main(String args[]){
        int arr[]={32,34,-23,100,45,23};
        System.out.println(isSum(arr,68,arr.length));
    }
}
