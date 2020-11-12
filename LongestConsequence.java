import java.util.Arrays;
import java.util.HashSet;

public class LongestConsequence {

    public static int longestSubsequenceinSubArray(int[] arr, int n){
        int length=1;
        int curr=1;
        Arrays.sort(arr);

        for (int i=1;i<n;i++){
            if(arr[i]==arr[i-1]+1)
                curr++;
            else{
                length=Math.max(length,curr);
                curr=1;
            }
        }
        length=Math.max(length,curr);

        return length;
    }


    public static int longestSubSequence(int[] arr,int n){
        int length=0;
        int curr;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

        System.out.println("Elements are :: "+ set);

        for(int i=0;i<n;i++){
            if(!set.contains(arr[i] - 1)){
                curr=1;
                while (set.contains(arr[i]+curr))
                    curr++;

                length=Math.max(length,curr);
            }
        }
        return  length;
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,5,6,7,8,9,10};
        int[] brr={45,34,12,11,78,90,46,67,5};
        System.out.println(longestSubsequenceinSubArray(arr,arr.length));
        System.out.println(longestSubsequenceinSubArray(brr,brr.length));
        System.out.println(longestSubSequence(arr,arr.length));
        System.out.println(longestSubSequence(brr,brr.length));

    }
}
