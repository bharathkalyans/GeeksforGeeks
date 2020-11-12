import java.lang.*;


public class insertionSort {

    public int[] InsertionSort(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;

            while( j>=0 && key<arr[j] ){  //Use j>=0 first or else you will be getting an error!!
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        printArray(arr);


        return arr;
    }

    private void printArray(int[] arr) {
        System.out.println("After Sorting");
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }


    public static void main(String args[]){
    System.out.println("Insertion Sort");
    insertionSort i=new insertionSort();
    int[] arr={-12,-23,2345,100,1,-876};
    i.InsertionSort(arr);
    }
}
