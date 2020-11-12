import java.util.HashMap;

public class LongestSubArraySum {

    public static int longestSubbarraywithSum(int[] arr,int n,int sum){
        int length=0;

        for(int i=0;i<n;i++){
            int curr_sum=0;
            for(int j=i;j<n;j++){
                curr_sum += arr[j];
                if(curr_sum == sum){
                    length=Math.max(length,j-i+1);
                }
            }
        }

        return length;
    }


    public static int longestSubArraySumEffec(int[] arr, int n,int sum){
        int length=0;
        int presum=0;
        HashMap<Integer,Integer> h=new HashMap<>();


        for(int i=0;i<n;i++){
            presum += arr[i];

            if(presum==sum)
                length=i+1;

            if(!h.containsKey(presum)){
                h.put(presum,i);
            }

            if(h.containsKey(presum-sum)){
                length=Math.max(length,i-h.get(presum-sum));
            }

        }


        return length;
    }

    public static void  main(String[] args){
        int[] arr = new int[]{8, 3, -7, -4, 1};
        int[] arr2={3,0,1,1,4,6,-6,2,2,-1,1};
        System.out.println(longestSubbarraywithSum(arr,arr.length,-8));
        System.out.println(longestSubbarraywithSum(arr2, arr2.length,4));
        System.out.println(longestSubArraySumEffec(arr,arr.length,-8));
        System.out.println(longestSubArraySumEffec(arr2,arr2.length,4));
    }

}
