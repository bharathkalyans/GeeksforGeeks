public class LargestAreainHistogram {


    public  static int getHistogramArea(int[] arr){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            int curr=arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]>=arr[i]){
                    curr +=arr[i];
                }else break;
            }
            for(int k=i+1;k<n;k++){
                if(arr[k]>=arr[i]){
                    curr +=arr[i];
                }else break;
            }
            res=Math.max(res,curr);
        }
        return res;
    }

   public static void getHistogramAreaEff(int[] arr){
       
    int res=0;
    
   }
    public static void main(String[] args) {
        int[] a={6,2,5,4,1,5,6};
        int [] b={0,1,4,1};
        System.out.println (getHistogramArea(a));
        System.out.println (getHistogramArea(b));
    }
}