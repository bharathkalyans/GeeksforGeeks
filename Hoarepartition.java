public class Hoarepartition {

    public static int hoare(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l-1;
        int j=h+1;
        while(true){
            do {
                i++;
            }while(arr[i]<pivot);

            do {
               j--;
            }while (arr[j]>pivot);

            if(i<j) {
                int temp = arr[i];//Swap(arr[i],arr[j])
                arr[i] = arr[j];
                arr[j] = temp;

            }else return j;
        }
    }
public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
    public static void main(String args[]){
        System.out.println("-------------Hoares Partition--------------");
        int[] a={5,3,8,4,2,7,1,10};
        int x=hoare(a,0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
