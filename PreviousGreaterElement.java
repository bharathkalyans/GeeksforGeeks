import java.util.ArrayDeque;


public class PreviousGreaterElement {

    public static void prevGreaterEle(int[] arr){
        int n=arr.length;

        System.out.print("-1 ");
        for (int i=1;i<n;i++){
            int p=-1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>=arr[i]){
                    p=arr[j];
                    break;
                }

            }
            System.out.print(p+" ");
        }
        System.out.println();
    }

    public static void prevGreaterElementEff(int[] arr){
        /*Its an Extension of StockSpan Problem
        * */
        ArrayDeque<Integer> s= new ArrayDeque<>();
        s.push(arr[0]);
        for (int j : arr) {
            while (!s.isEmpty() && s.getFirst() <= j) {
                s.pop();
            }
            int pg = s.isEmpty() ? -1 : s.getFirst();
            System.out.print(pg + " ");
            s.push(j);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr={15,10,18,12,4,6,2,8};
        int[] brr={5,10,20,30,40};

        prevGreaterEle(arr);
        prevGreaterEle(brr);
        prevGreaterElementEff(arr);
        prevGreaterElementEff(brr);
    }
}
