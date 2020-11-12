public class Rotateby90 {
    static void transposeOfMatrix(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
           }
        }
    }

    static void rotateBy90(int[][] arr){
        transposeOfMatrix(arr);
        for(int i=0;i<arr.length;i++){
             int low=0,high=arr.length-1;
             while (low<high){
                 int temp=arr[low][i];
                 arr[low][i]=arr[high][i];
                 arr[high][i]=temp;
                 low++;
                 high--;
             }
        }
    }


    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        rotateBy90(a);

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
