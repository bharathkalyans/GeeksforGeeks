import java.util.ArrayDeque;

public class StockSpan {

    public static void stockSpanNaive(int[] arr){
        int n=arr.length;
        if(n==0) return;
        else if(n==1){
            System.out.println("1");
            return;
        }

        System.out.print("1 ");

        for(int i=1;i<n;i++){
            int span=1;
            for(int j=i-1;j>=0 && arr[j]<arr[i];j--){
                    span++;
            }
            System.out.print(span+" ");
        }
        System.out.println();
    }

    public static void stockSpanEff(int[] arr){
        int n=arr.length;
        ArrayDeque<Integer> s= new ArrayDeque<>();
        System.out.print("1 ");
        s.push(0);
        int span;
        for (int i=1;i<n;i++){
            while(!s.isEmpty() && arr[s.getFirst()]<=arr[i]){
                s.pop();
            }
            span=s.isEmpty()?i+1:i-s.getFirst();
            System.out.print(span+" ");
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int [] arr={13,15,12,14,16,8,6,4,10,30};
//        int[] brr={30,20,25,28,27,29,Integer.MAX_VALUE};
        stockSpanNaive(arr);
        System.out.println();
        stockSpanEff(arr);
    }
}
