import java.util.Arrays;

public class ChocolateDistribution {

    public static int minDiff(int[] a,int n,int m){
        if(m>n) return -1;
        int res=a[m-1] -a[0];

        for (int i=1;i+m-1<n;i++){
            res=Math.min(res,a[i+m-1]-a[i]);
        }

        return res;
    }

    public static void main(String args[]){
        int[] a={7,3,2,4,9,12,56};
        Arrays.sort(a);
        int x=minDiff(a,a.length-1,4);
        System.out.println(x);
    }
}
