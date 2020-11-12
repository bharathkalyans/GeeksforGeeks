public class PrintIthProductElement {
    public static void printIthproduct(int[] arr){
        int n=arr.length;


        for (int i=0;i<n;i++){
            long product=1;
            for (int j=0;j<n;j++){
                if(i==j)
                    continue;

                product *= arr[j];

            }
            System.out.print(product+ " ");
        }
        System.out.println();

    }//O(n^2) Time Complexity


    public static void printIthEle(int[] arr){

        int n=arr.length;
        int count=0;
        long product=1;
        for (int k : arr) {
            if (k == 0) {
                count++;
                continue;
            }
            product *= k;
        }


        if(count>1){
            for (int i=0;i<n;i++)
                System.out.print("0 ");
        } else if(count==1){
            for (int j : arr) {
                if (j == 0)
                    System.out.print(product + " ");
                else
                    System.out.print("0 ");
            }
        }else{
            for (int j : arr) System.out.print(product / j + " ");
        }
        System.out.println();
    }



    public static void main(String[] args){

        int[] a={3,5,7,1};
        printIthproduct(a);

        printIthEle(a);
    }
}
