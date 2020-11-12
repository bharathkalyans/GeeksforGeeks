import java.util.HashSet;

public class CountDistinctElements {


    public static int countDistinct(int[] arr,int n){
        if(n==0)
            return 0;

        int res=1;

        for (int i=1;i<n;i++){
             boolean flag=false;
             for (int j=0;j<=i-1;j++){
                 if (arr[j] == arr[i]) {
                     flag = true;
                     break;
                 }
             }
             if(!flag)
                 res++;

        }

        return  res;
    }//O(n^2) Complexity!!

    public static void countDistinctsEffective() {
        HashSet<Integer> h=new HashSet<>();
        int[] a={13,13,45,15,15,67,90,90};

        for (Integer b:
                a) {
            h.add(b);
        }
        System.out.println(h);
        System.out.println(h.size());

    }

    public static void main(String [] args){
        int[] a={13,13,45,15,15,67,90,90};
        System.out.println("Naive Approach Solution :"+countDistinct(a,a.length));
        countDistinctsEffective();
    }

}
