public class PatternmatchingNaive {


    public static void patternNaive(String text,String pattern){
        int n=text.length();
        int m=pattern.length();

        for (int i=0;i<n-m+1;i++){
            for (int j=0;j<m;j++){
                if(pattern.charAt(j)!=text.charAt(i+j))
                    break;

                if(j==m-1)
                    System.out.print(i+"  ");

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String text="varungoli";
        String pattern="goli";
        patternNaive(text,pattern);

    }

}
