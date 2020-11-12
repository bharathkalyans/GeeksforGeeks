import java.util.Arrays;
import java.util.HashSet;

public class SumOfaPair {

    public static boolean isPair(int[] arr,int sum){

        Arrays.sort(arr);
        int n=arr.length;
        int left=0,right=n-1;

        while(left<=right){
            if(arr[left]+arr[right]== sum)
                return true;
            else if(arr[left]+arr[right]>sum)
                right--;
            else
                left++;
        }

        return false;
    }//O(NlogN)Time and O(1) Space Complexity!!


    public  static boolean isPairEffective(int[] arr,int sum){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(sum-arr[i]))
                return true;

            set.add(arr[i]);//Add the array Element only if it doesn't exist in the Set.
        }
        return false;
    }// O(n) and O(n) Time and Space Complexity     -->Effective One


    public static void main(String args[]){
        int[] arr={11,5,6};
        int[] brr={3,2,8,15,-7,-8};

        System.out.println("Two - Pointer:: "+ isPair(brr,17)+" , Effective:: "+isPairEffective(brr,17));
        System.out.println("IMP test case:: "+ isPairEffective(arr,10));
    }

}
