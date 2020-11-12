public class KthSmallestElement {

    //Lomuto Partition
    public static int Partition(int[] arr,int l,int h){
        int pivot=arr[h];
        int i=l-1;

        for (int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];//Swap(arr[i],arr[j])
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        int temp2=arr[h]; /***Swap(last element which is a pivot Element with the  first highest element)***/
        arr[h]=arr[i+1];
        arr[i+1]=temp2;

        return i;
    }
    public int findKthElementByQuickSelect(int[] arr, int left, int right, int k) {
        if (k >= 0 && k <= right - left + 1) {
            int p = Partition(arr, left, right);

            if(p-left==k-1)
                return arr[p];
            if(p-left>k-1)
                return findKthElementByQuickSelect(arr,left,p-1,k);

            return findKthElementByQuickSelect(arr,p+1,right,k-p+left -1);

        }
        return Integer.MIN_VALUE;
    }

    public static void main(String args[]){
        System.out.println("------------Kth Smallest Element---------------");
        KthSmallestElement k=new KthSmallestElement();
        int[] a={23,54,98,0,1,2};
      int l=  k.findKthElementByQuickSelect(a,0,a.length-1,5);
        System.out.println(l);
    }
}
