import java.util.ArrayList;

public class Merge3Arrays {
    public static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here
        ArrayList<Integer> al=new ArrayList<Integer>();

        int n=A.length;
        int m=B.length;
        int o=C.length;
        int i=0,j=0,k=0,l;
        while(i<n && j<m && k<o){
            if(A[i]<B[j]){
                if(A[i]<C[k]){
                    al.add(A[i++]);
                }else{
                    al.add(C[k++]);
                }
            }else{
                if(B[j]<C[k]){
                    al.add(B[j++]);
                }else{
                    al.add(C[k++]);
                }
            }
        }
        while(i<n && j<m){
            if(A[i]<B[j]){
                al.add(A[i++]);
            }else{
                al.add(B[j++]);
            }
        }

        while(i<n && k<o){
            if(A[i]<C[k]){
                al.add(A[i++]);
            }else{
                al.add(C[k++]);
            }
        }
        while(j<m && k<o){
            if(B[j]<C[k]){
                al.add(B[j++]);
            }else{
                al.add(C[k++]);
            }
        }

        while(i<n){
            al.add(A[i++]);
        }
        while(j<m){
            al.add(B[j++]);
        }
        while(k<o){
            al.add(C[k++]);
        }


        System.out.println(al);

        return al;
    }

    public static void main(String args[]) {
        System.out.println("------------Kth Smallest Element---------------");


        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 5};
        int[] c = {6, 7, 8, 9};
        merge3sorted(a,b,c);
    }
}