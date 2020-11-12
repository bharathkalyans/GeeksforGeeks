import java.util.HashMap;

public class LongestSubArrayWithEqual0and1 {

    public static int longestSub(int[] arr, int n){
        int res=0;

        for(int i=0;i<n;i++){
            int c0=0,c1=0;
            for(int j=i;j<n;j++){
                if(arr[j]==0) c0++;
                else c1++;

                if(c0==c1){
                    res=Math.max(res,j-i+1);
                }

            }
        }
        return res;
    }//O(n^2)


    public static int longestSubEffecient(int[] arr,int n){
        //** The trick is to replace 0 with -1   and call longestSubarraywithSum function**//
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }

        int result=longestSubArraySumEffec(arr,arr.length,0);

        return result;

    }//O(n) and O(n) Time and Space!!

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

    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,0};
        int [] brr={1,1,1,1,1};
        System.out.println(longestSubEffecient(arr,arr.length));
        System.out.println(longestSubEffecient(brr,brr.length));
    }

}
