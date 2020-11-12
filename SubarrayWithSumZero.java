import java.util.HashSet;

public class SubarrayWithSumZero {

    public static boolean isZero(int[] arr,int n){

        for (int i=0;i<n;i++){
            int curr_sum=0;
            for(int j=i;j<n;j++){
                curr_sum += arr[j];
                if(curr_sum==0)
                    return true;
            }
        }
        return  false;
    }//O(n^2) time complexity!!

    public static boolean isSubarraySumZero(int[] arr){
        int n=arr.length;
        HashSet<Integer> h=new HashSet<>();
        int presum=0;
        for (int i=0;i<n;i++){
            presum +=arr[i];
            if(h.contains(presum)){
                return  true;
            }
            if(presum==0)
                return true;

            h.add(presum);
        }
        return  false;
    }//O(n) and O(n) Time and Space Complexity!

    public static void  main(String args[]){
        int[] arr={1,4,13,-3,-10,45};
        System.out.println("Naive :"+isZero(arr,arr.length)+" Effecient:: "+isSubarraySumZero(arr));

    }
}
