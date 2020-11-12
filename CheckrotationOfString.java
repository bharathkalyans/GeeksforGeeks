public class CheckrotationOfString {


    public static void checkRotation(String str1,String str2){

        if(str1.length()!=str2.length())
            return;
        int i=0,n=str1.length();
        while(i<n){

            if(str1.equals(str2)){
                System.out.println("Rotation true");
                break;
            }
            else{
                str1=rotate(str1);
                i++;
            }
        }


    }


    public static String  rotate(String str){
        char [] s=str.toCharArray();
        char temp=s[0];
        for(int i=0;i<s.length-1;i++){
            s[i]=s[i+1];
        }
        s[s.length-1]=temp;

        return new String(s);
    }


    public static boolean isRotated(String s1,String s2){
        if(s1.length()!=s2.length()) return false;

        return ((s1+s1).indexOf(s2)>=0);

    }

    public static void  main(String[] args){
        checkRotation("ABCD","DABC");
        System.out.println(isRotated("ABCD","DABC"));

    }
}
