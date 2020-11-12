import java.util.HashMap;

public class LongestCommonSpanWithSameSum {


    public static int  longestSameSpan(int[] arr1,int[] arr2,int n){
        int length=0;

        for(int i=0;i<n;i++){
            int sum1=0,sum2=0;
            for(int j=i;j<n;j++){
                sum1 += arr1[j];
                sum2 += arr2[j];

                if(sum1 == sum2)
                    length=Math.max(length,j-i+1);

            }
        }
        return length;
    }//O(n^2) Time and O(1) Space!

    public static int longestSameSpanEfficient(int[] arr1,int [] arr2,int n){
        int[] temp =new int[n];

        for(int i=0;i<n;i++){
            temp[i]=arr1[i]-arr2[i];
        }

        return longestSubArraySum(temp,temp.length,0);
    }


    public static int longestSubArraySum(int[] arr,int n,int sum){
        HashMap<Integer,Integer> h=new HashMap<>();
        int length=0,presum=0;

        for(int i=0;i<n;i++){
            presum+=arr[i];

            if(presum == sum)
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

        int[] arr1={0,1,0,1,0,0};
        int[] arr2={1,1,0,1,1,1};
        System.out.println(longestSameSpan(arr1,arr2,arr1.length));
        System.out.println(longestSameSpanEfficient(arr1,arr2,arr1.length));
    }
}
