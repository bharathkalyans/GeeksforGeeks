import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] arr,int l,int h){
       if(h>l) {
           int p=lomutoPartition1(arr,l,h);
           quickSort(arr,l,p-1);
           quickSort(arr,p+1,h);
       }
    }
    public static int lomutoPartition1(int[] arr,int l,int h){
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

        return i+1;
    }

    /** Using  Hoares Partition!!!! which is 3 x faster than Lomuto Partition**/

    //**  public void quickSort(int[] arr,int l,int h){
    //        if(h>l) {
    //            int p=hoare1(arr,l,h);
    //            quickSort(arr,l,p);
    //            quickSort(arr,p+1,h);
    //        }
    //    }
    //
    //    public static int hoare1(int arr[],int l,int h){
    //        int pivot=arr[l];
    //        int i=l-1;
    //        int j=h+1;
    //        while(true){
    //            do {
    //                i++;
    //            }while(arr[i]<pivot);
    //
    //            do {
    //                j--;
    //            }while (arr[j]>pivot);
    //
    //            if(i<j) {
    //                int temp = arr[i];//Swap(arr[i],arr[j])
    //                arr[i] = arr[j];
    //                arr[j] = temp;
    //
    //            }else return j;
    //        }
    //    }   **//

    public static void main(String args[]){
        System.out.println("-------------Quick Sort ----------------------");
        QuickSort qs=new QuickSort();
        int[] a={23,34,-1,44,10000,-1933,9,0,1,1,1,23,45,65,-123,98};



        //********        *************//
        qs.quickSort(a,0,a.length-1);

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
