public class mergeSort {
    public void sort(int[] arr,int l,int r){
        if(r>l){
            int mid=(l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public void  merge(int[] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[i+l];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+1+j];
        }
        int i=0,j=0;
        int k=l;
        while( i<n1 && j<n2) {
            if(L[i]<=R[j]) {      // " = " take cares of Stability!!!
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
public  void printarray(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String args[]){
        mergeSort m=new mergeSort();
        System.out.println("-----------Merge Sort-------------");
        int[] a={-1,-204,23,90,455666,1,0,23,23,45,54,23,10000};
        m.sort(a,0,a.length-1);
        m.printarray(a);
    }
}
