public class PermutationOfString {

/**
 * For Lexiographic Arrangement of Printing permutations just sort the string !!!
 * **/

    public static void permutationOfStringg(String pre,String str){
        int n=str.length();

        if(n==0){
            System.out.println(pre);
        }
        for (int i=0;i<n;i++) {
            permutationOfStringg(pre + str.charAt(i), (str.substring(0, i) + str.substring(i + 1, n)));
        }
    }


    public static void permuteString(String str){
        /**---->For Lexiographic Arrangement!
         * char []a=str.toCharArray();
         * Arrays.sort(a);
         * String str=new String(a);
         * **/
        permutationOfStringg("",str);
    }


    public static void main(String[] args) {
        permuteString("CAB");

    }

}
