import java.util.Arrays;

public class LomutoPartition {
    public static int lomutoPartition(int[] arr,int l,int h){
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
    public  static  void main(String args[]){
        System.out.println("---------Lomuto Partition!!!---------------");
        int[] a={10,80,30,90,40,50,70};
        int n=a.length;
        int x=lomutoPartition(a,0,n-1);
        System.out.println(x);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
