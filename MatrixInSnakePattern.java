public class MatrixInSnakePattern {


    public static void printSpiral(int [][] arr){

        for (int i=0;i<arr.length;i++){
            if(i%2==0){
                for (int j=0;j<arr[i].length;j++){
                        System.out.print(arr[i][j]+" ");
                }
            }else{
                for (int j=arr[i].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }

        }
    }

    public static void main(String args[]){
        int[][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        printSpiral(a);

    }
}
