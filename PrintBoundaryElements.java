public class PrintBoundaryElements {


    public  static void printBoundary(int[][] arr){
        int R=arr.length;
        int C=arr[0].length;
        if(R==1){
            for (int i=0;i<C;i++){
                System.out.print(arr[0][i]+" ");
            }
        }else if(C==1){
            for (int i=0;i<R;i++){
                System.out.print(arr[i][0]+" ");
            }
        }else{
            for(int i=0;i<C;i++){
                System.out.print(arr[0][i]+" ");
            }
            for(int i=1;i<R;i++){
                System.out.print(arr[i][C-1]+" ");
            }
            for (int i=C-2;i>=0;i--){
                System.out.print(arr[R-1][i]+" ");
            }
            for(int i=R-2;i>=1;i--){
                System.out.print(arr[i][0]+" ");
            }
        }
    }


    public static void main(String args[]) {
        int[][] a = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int[][] b={{1,2,3,4,5}};
        int [][] c={{1},{2},{3},{4},{5}};
        int[][] d={{1,2},{5,17}};
        /****     printing Array      **/
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");

        printBoundary(a);
        System.out.println();
        printBoundary(b);
        System.out.println();
        printBoundary(c);
        System.out.println();
        printBoundary(d);
    }
}
