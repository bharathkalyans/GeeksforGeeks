public class ThreeWayPartioning {
    public void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    //Dutch National Flag Problem!!!
    public void partition(int [] ar,int n){
        int low=0,mid=0,high=n-1,x=90;
        while(mid<=high){
            switch(ar[mid]){
                case 0:swap(ar,low,mid);
                         mid++;
                         low++;
                         break;
                        
                case 1:mid++;
                         break;
                case 2:swap(ar,high,mid);
                         high--;
                         break;
            }
        }
    }
    public  void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        ThreeWayPartioning t=new ThreeWayPartioning();
        int[] arr={1,2,0,0,0,1,1,1,2,0,2,0,2};
        t.partition(arr,arr.length );
        t.printArray(arr);
    }
}
