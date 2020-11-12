import java.util.HashMap;
import java.util.HashSet;

public class DistinctElementsinEveryWindow {

    //**Three Solutions with Optimized way**//
    public static void distinctElements(int[] arr, int n, int size) {

        for (int i = 0; i <= arr.length - size; i++) {
            int distinct = 0;

            for (int j = i; j < i + size; j++) {   // Window Size of "K".
                distinct++;
                for (int k = i; k < j; k++) {// Checking if the Element is already present!!
                    if (arr[j] == arr[k]) {
                        distinct--;
                        break;
                    }
                }
            }

            System.out.println( distinct);
        }
    }//O(n-k * k * k) Time Complexity!! In worst case it might become Cubic(k^3)!!!!!!

    public static void distinctElements2(int[] arr, int n, int size) {

        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <= arr.length - size; i++) {
           for(int j=i;j<i+size;j++){
               set.add(arr[j]);
           }
            System.out.println("No. of Distinct Elements are::" + set.size());
            set.clear();
        }
    }//O(n-size * size) Time and O(size) Space  Complexity!!!


   public static void countDistinct(int arr[], int k)
    {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        for (int i = 0; i < k; i++)
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);

        System.out.println(hM.size());

        for (int i = k; i < arr.length; i++) {


            if (hM.get(arr[i - k]) == 1) {
                hM.remove(arr[i - k]);
            } else
                hM.put(arr[i - k],  hM.get(arr[i - k]) - 1);

            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);

            System.out.println(hM.size());
        }
    }//O(n) and O(n) Time and Space Complexity!!!


    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,5,6,1,1,7};
        distinctElements(arr,arr.length,4);
        System.out.println("-------------------------");
        countDistinct(arr,4);
        System.out.println("-------------------------");
        distinctElements2(arr,arr.length,4);
    }
}
