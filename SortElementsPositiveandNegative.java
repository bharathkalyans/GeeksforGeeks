public class SortElementsPositiveandNegative {

    public  void sort(int[] arr,int n){
        int i=-1,j=n;

        while (true){
            do{i++;}while (arr[i]<0);//If the array is Binary use (arr[i]<=0)
            do{j--;}while (arr[j]>=0);//If the array is Binary use (arr[i]>0)

            if(i>=j) return;
            swap(arr,i,j);
        }
    }

    public  void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String args[]){
        int[] a={-1,223,0,-23444,1,78,-98,-10000,8900};
//        int[] b={0,0,1,1,1,0,1,0,1,0};
        SortElementsPositiveandNegative ss=new SortElementsPositiveandNegative();
        ss.sort(a,a.length);
        ss.printArray(a);
//        ss.sort(b,b.length);
//        ss.printArray(b);
    }
}
