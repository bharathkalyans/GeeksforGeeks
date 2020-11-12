import java.util.Scanner;

public class PascalsTriangle {


    public static void printpascals(int n){
        int [][] t=new int[n][];

        for(int i=0;i<n;i++){
            t[i]=new int [i+1];
            for(int j=0;j<=i;j++){
                if(j==i || j==0)
                    t[i][j]=1;
                else
                    t[i][j]=t[i-1][j-1]+t[i-1][j];

            }
        }
        System.out.println("--------------------------------");
        for (int i=0;i<n;i++){
            for(int j=0;j<t[i].length;j++){

                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printpascals(6);

    }
}
