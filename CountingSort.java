public class CountingSort {

    public void sort(int[] arr,int n, int k){
        int[] count=new int[k];
        int[] output=new int[n];

        for(int i=0;i<k;i++)
            count[i]=0;
        for(int j=0;j<n;j++)
            count[arr[j]]++;

        for(int p=1;p<k;p++)//Cummulative Count of Occurences
            count[p]=count[p-1]+count[p];
        //To make Counting Sort a Stable Algorithm Start from last!!!

        for(int q=n-1;q>=0;q--){
            output[count[arr[q]]-1]=arr[q];
            count[arr[q]]--;
        }
        for (int g=0;g<output.length;g++){
            System.out.print(output[g]+" ");
        }


    }

    public static void main(String args[]){
        int arr[]={1,4,4,1,0,1};
        CountingSort c=new CountingSort();
        c.sort(arr,arr.length,5);

    }
}
