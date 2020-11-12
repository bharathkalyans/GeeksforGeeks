import java.util.Arrays;

public class intersectionOfArray {

    public  void intersectionofarray(int[] a,int[] b){

        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }

            if(a[i]<b[j]){i++;}
            else if(a[i]>b[j]){j++;}
            else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        System.out.println();
    }   //Time Complexity::O(m+n)

    public static void main(String args[]){
        System.out.println("-------Intersection of Array----------");
        int[] a={1,2,3,4,5,6,6,6,7,8};
        int[] b={2,3,3,3,4,5,6,6,7};
        intersectionOfArray i=new intersectionOfArray();
        i.intersectionofarray(a,b);


    }
}
