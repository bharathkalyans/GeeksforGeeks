import java.math.BigInteger;
import java.util.*;

public class demo {
    public static int Partition(int[] arr,int l,int h){
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
    public int ksmallest(int [] arr,int l,int r,int k){
        int n=r+1;
        if(k>n) return Integer.MIN_VALUE;
        while(l<=r){
            int p=Partition(arr,l,r);
            if(p==k-1)
                return arr[p];
            if(p>k-1)
                r=p-1;
            else
                l=p+1;

        }
       return Integer.MIN_VALUE;
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i=0,j=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                al.add(arr1[i++]);
            }else if(arr2[j]<arr1[i]){
                al.add(arr2[j++]);
            }else{
                al.add(arr1[i]);
                i++;
                j++;
            }
        }


        return al;
    }
//    public ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int a, int b)
//    {
//        //add code here.
//        int low=0,mid=0,high=A.size()-1;
//
//        while(mid<=high){
//            if(A.get(mid)<a){
//                Collections.swap(A,low,mid);
//                low++;
//                mid++;
//            }else if(A.get(mid)>b){
//                Collections.swap(A,mid,high);
//                high--;
//                mid++;
//            }else{
//                mid++;
//            }
//
//        }
//        return A;
//    }
    public static char[] countSort(char[] seq)
    {
        // add your code here

        int n=seq.length;
        int[] temp=new int[26];
        for(int i=0;i<26;i++){
            temp[i]=0;
        }

        for(int i=0;i<n;i++){
            temp[(int)seq[i]]++;
        }

        for(int i=1;i<26;i++){
            temp[i]=temp[i]+temp[i-1];
        }
        char[] output=new char[n];

        for(int i=n-1;i>=0;i--){
           output[(char)temp[seq[i]]-1]=seq[i];
           temp[seq[i]]--;
        }

        for(int i=0;i<n;i++){
            seq[i]=output[i];
        }

    return seq;
    }
    public ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int a, int b)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();

        int start=0,end=A.size()-1;

        for(int i=0;i<A.size();i++){
            if(A.get(i)<a){
                int temp=A.get(i);
                A.set(i,A.get(start));
                A.set(start,temp);
                start++;
            }
            else{
                int jemp=A.get(i);
                A.set(i,A.get(end));
                A.set(end,jemp);
            }
        }
        return al;
    }
    public  long closer(int arr[], int n, long x)
    {
        // add your code here
        int low=0,r=n-1;

        while(low<r){
            int mid=(low+r)/2;
            if(arr[mid]==x)
                return mid;

            if(mid>low && arr[mid-1]==x)
                return mid-1;
            else if(mid<r && arr[mid+1]==x)
                return mid+1;

            if(arr[mid]>x){
                r=mid-2;
            }
            else{
                low=mid+2;
            }
        }
        return -1;
    }
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();

        int top=0,right=c-1,bottom=r-1,left=0;

        while(top<=bottom && left<=right){

            for(int i=0;i<=right;i++)
                al.add(matrix[top][i]);

            top++;

            for(int i=top;i<=bottom;i++)
                al.add(matrix[i][right]);

            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                    al.add(matrix[bottom][i]);

                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    al.add(matrix[i][left]);

                left++;
            }


        }
        return al;
    }
    public static void main(String[] args){
        System.out.println("------------Kth Smallest Element---------------");

      int matrix[][] = {{1, 2, 3},
              {4, 5, 6},
              {7, 8, 9},
              {10, 11, 12},
              {13, 14, 15}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
        int n=matrix.length;
        int high=matrix.length-1;
        for(int i=0;i<n/2;i++){

            for(int j=0;j<matrix[0].length;j++){

                int temp=matrix[i][j];
                matrix[i][j]=matrix[high][j];
                matrix[high][j]=temp;
            }high--;

        }

            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
    //





    }



//        int[] a={3,2,10,4,40};
//        int[] b=new int[20];
//
//        BigInteger f=new BigInteger("1");
//
//        for(int i=2;i<101;i++)
//        {
//            f=f.multiply(BigInteger.valueOf(i));
//        }
//        System.out.println(f);

//        System.out.println(n.closer(a,a.length,20));

//        System.out.println(n.ksmallest(a,0,a.length-1,6));
//
//        ArrayList<Integer> al=new ArrayList<Integer>();
//        al.add(1);
//        al.add(2);
//        al.add(4);
//        al.add(3);
//        al.add(3);
//
//
//        n.threeWayPartition(al,2,3);
//        System.out.println(al);
//        System.out.println((char)(97));
    }
