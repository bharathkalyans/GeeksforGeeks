public class bubbleSort {

    public static void bubbleSort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i +" ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr){
        int low=0,high=arr.length-1;

        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String args[]){
        System.out.printf("Bubble Sort");
        int arr[]={1,34,1000,56,-1,0,9743548,-1234,0};
        bubbleSort(arr);
        reverseArray(arr);
        //Bubble Sort pushes the MAximum element to the right most corner !!!
    }
}
