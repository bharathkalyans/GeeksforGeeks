import java.util.HashSet;

public class IntersectingElements {

    public static void intersectingElements(int[] a,int[] b){
        //Assuming n>m!! Else swap n and m.
        int n=a.length;
        int res=0;

        if(n==1) {
            for (int i : b) {
                if (i == a[0])
                    res++;
            }
            System.out.println("TotalIntersectioms are : "+ res);
            return;
        }

        for (int k : b) {
            if (a[0] == k) {
                res++;
                break;
            }
        }
        for (int i=1;i<n;i++){
            boolean flag=false;
            for(int j=0;j<=i-1;j++){
                if(a[j]==a[i]){
                    flag=true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            for (int k : b) {
                if (a[i] == k) {
                    res++;
                    break;
                }
            }

        }//O(n*(m+n)+ 2m)
        System.out.println("Total Intersections are:: "+res);

    }

    public static void  intersectingElementsEffective(int[] a,int[] b){

        int res=0;
        HashSet<Integer> set=new HashSet<>();
        for (int k : a) {
            set.add(k);
        }

        for (int i : b) {
            if (set.contains(i)) {
                res++;
                set.remove(i);
            }
        }
        System.out.println("Total Intersecting Elements are using HashSet:: "+ res);
    }//O(m+n)Time and O(m) or O(n) Space Complexity!


    public static void main(String[] args){

        int[] a={10,15,15,80,30,5};
        int[] b={30,5,30,80,15,20};
        intersectingElements(a,b);
        intersectingElementsEffective(a,b);
    }

}
