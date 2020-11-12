public class PatternMatchingNaiveDistinct {


    public static void patternMatching(String text,String pattern){

        int n=text.length();
        int m=pattern.length();

        for (int i=0;i<n-m+1;){
            int j;
            for ( j=0;j<m;j++){
                if(text.charAt(i+j)!=pattern.charAt(j))
                    break;
            }
            if(j==m){
                System.out.print(i+" ");
            }
            if(j==0)
                i++;
            else
                i=i+j;
        }
    }


    public static void main(String[] args) {

        String text="ABCEABBCABCD";
        String pattern="ABCD";
        patternMatching(text,pattern);

    }
}
