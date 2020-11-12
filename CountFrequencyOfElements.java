import java.util.*;

public class CountFrequencyOfElements {

    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {


            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }//O(n) Space and O(n^2) Time Complexity is Required!!


    public static void countFreqOfElements(int[] arr,int n){
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        //LinkedHashMap make sures that your output is in Same Order!!!

        for (int i=0;i<n;i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);

    }//Effective Solution!!

    public static void main(String [] args){
        int[] a={13,13,45,15,15,67,90,90};

        countFreq(a,a.length);
        System.out.println("----------------------------------");
        countFreqOfElements(a,a.length);

    }
}
