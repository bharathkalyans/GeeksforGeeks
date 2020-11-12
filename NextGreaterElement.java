import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterElement {

    public static void nextGreaterElement(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int ng=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>=arr[i]){
                    ng=arr[j];
                    break;
                }
            }
            System.out.print(ng+" ");
        }
        System.out.println();
    }


    public static void nextGreaterElementEff(int[] arr){
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        al.add(-1);
        ArrayDeque<Integer> s=new ArrayDeque<>();
        s.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while (!s.isEmpty() && s.getFirst()<=arr[i])
                s.pop();

            int ng=s.isEmpty()?-1:s.getFirst();
            al.add(ng);
            s.push(arr[i]);
        }
        Collections.reverse(al);

        System.out.println(al);
    }

    public static void main(String[] args) {
        int[] arr={5,15,10,8,6,12,9,18};
        nextGreaterElement(arr);
        nextGreaterElementEff(arr);
    }
}





















