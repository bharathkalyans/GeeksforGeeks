import java.util.*;

public class MoreThanNbyK {

    public static void moreThanNbykOccur(int[] arr,int n,int k){

        Arrays.sort(arr);

        int count=1,i=1;

        while (i<n){

            while(i<n && (arr[i-1]==arr[i])){
                count++;
                i++;
            }
            if(count > (n/k))
                System.out.print(arr[i-1]+" ");

            count=1;
            i++;

        }
        System.out.println();
    }//O(NlogN) Time Complexity!!

    public static void moreThanNByK(int [] arr,int k){
        int n=arr.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        //Creating a  frequency Map!!
        for(int a: arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(Map.Entry<Integer,Integer> m: map.entrySet()){

            if(m.getValue() > n/k){
                System.out.print(m.getKey()+" ");
            }
        }

    }


    public static void main(String args[]) {
        int [] arr={1,8,8,9,9,6,6,6,9,4,4,3};
        moreThanNbykOccur(arr,arr.length,5);
        moreThanNByK(arr,5);
    }
}
