public class RadixSort {


    public void radixSort(int[] arr,int n){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }

        for (int exp=1;(max/exp)>0;exp=exp*10){
            countingSort(arr,n,exp);
        }
    }//Radix Sort Uses Counting Sort as a Routine!!


    public void countingSort(int[] arr,int n ,int exp){
        int []count=new int[10];
        int []output=new int[n];
        for (int i=0;i<n;i++){count[i]=0;}

        for (int j=0;j<n;j++){
            count[(arr[j]/exp)%10]++;
        }
        for (int q=1;q<10;q++){
            count[q]=count[q]+count[q-1];
        }

        for (int h=n-1;h>=0;h--){
            output[count[(arr[h]/exp)%10]-1]=arr[h];
            count[ (arr[h]/exp)%10 ]--;//Decrement the Count in the Count Array
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }


    }

    public static void main(String args[]){
        RadixSort r=new RadixSort();
        int[] arr={319,212,6,8,100,50,1000000,10000000};
        r.radixSort(arr,arr.length);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
