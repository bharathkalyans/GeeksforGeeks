import java.util.Arrays;

public class InversionOfArray {

    public int countInv(int[] arr,int l,int r){
        int res=0;

        if(r>l){
             int mid=(l+r)/2;
             res +=countInv(arr,l,mid);
             res +=countInv(arr,mid+1,r);
             res+=countmerge(arr,l,mid,r);
        }

        return res;
    }

    public  int countmerge(int[] arr,int l,int m,int r){

//
        int n1=m+1-l;
        int n2=r-m;
        int []left=new int[n1];
        int []right=new int[n2];
        for (int i=0;i<n1;i++){left[i]=arr[i+l];}
        for (int j=0;j<n2;j++){right[j]=arr[m+1+j];}
//
//        int p=0,q=0,k=l,swaps=0;
//        while (p<n1 && q<n2){
//            if(left[p]<=right[q]){
//                arr[k++]=left[p++];
//            }
//            else{
//                arr[k++]=right[q++];
//                swaps=swaps+(n1-p);
//            }
//            while(p<n1){arr[k++]=left[p++];}
//            while(q<n2){arr[k++]=right[q++];}
//
//        }
//
//        return swaps;
        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += left.length - i;
            }
        }

        // Fill from the rest of the left subarray
        while (i < left.length)
            arr[k++] = left[i++];

        // Fill from the rest of the right subarray
        while (j < right.length)
            arr[k++] = right[j++];

        return swaps;
    }

    public static void main(String args[]){
        System.out.println("------------------Count Inversion of Array--------------------");
        InversionOfArray i=new InversionOfArray();
        int[] arr={ 1,1,1,1,1,1,1,1,2,1};
        int[] aux = Arrays.copyOf(arr, arr.length);

        System.out.println(i.countInv(aux,0,arr.length-1));
        System.out.println();
    }
}
