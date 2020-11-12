public class UnionOfArray {

    public void union(int[] a,int []b){

        int m=a.length;
        int n=b.length;
        int i=0,j=0;

        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(j>0 && b[j-1]==b[j]){
                j++;
                continue;
            }

            if(a[i]<b[j]){
                System.out.print(a[i] +" ");
                i++;
            }
            else if(b[j]<a[i]){
                System.out.print(b[j]+" ");
                j++;
            }
            else{
                System.out.print(a[i]+" ");
                i++;j++;
            }
        }
        while (i<m){
            if(i==0 || a[i-1]!=a[i]){
                System.out.print(a[i++]+" ");
            }
        }
        while(j<n){
            if(j==0 || b[j-1]!=b[j]){
                System.out.print(b[j++]+" ");
            }
        }

    }


    public static void main(String args[]){
        System.out.println("------------Union  of  Array---------------");
        UnionOfArray u=new UnionOfArray();
        int[] a={1,2,2,2,3,4,4,5};
        int[] b={4,4,5,6,7,8,9};
        u.union(a,b);
    }
}
