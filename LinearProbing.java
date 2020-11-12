public class LinearProbing {

    int cap,size;
    int[] arr;
    LinearProbing(int c){
        cap=c;
        size=0;
        arr=new int[cap];

        for(int i=0;i<cap;i++)
            arr[i]=-1;
    }

    int hash(int key){
        return key%cap;
    }

    boolean search(int key){
        int h=hash(key);
        int i=h;

        while (arr[i]!=-1 ){

            if(arr[i]==key)
                return true;

            i=(i+1)%cap;

            if(i==h)
                return false;

        }


        return false;
    }

    boolean insert(int key){

        if(size==cap)
            return false;

        int i=hash(key);

        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]==key){
            i=(i+1)%cap;
        }

        if(arr[i]==key)
            return false;
        else {
            arr[i] = key;
            size++;

            return  true;
        }
    }

    boolean delete(int key){

        int h=hash(key);

        int i=h;

        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;
                return true;
            }
            i=(i+1)%cap;
            if (i==h)
                return false;

        }
        return   false;
    }

    public static void main(String[] args){
        
        LinearProbing l=new LinearProbing(7);
        System.out.println(l.delete(10));
        System.out.println(l.insert(23));
        System.out.println(l.insert(78));
        System.out.println(l.insert(77));
        System.out.println(l.insert(45));
        System.out.println(l.insert(29));
        System.out.println(l.insert(91));
        System.out.println(l.delete(77));
        System.out.println(l.insert(100));
        System.out.println(l.search(9001)+" "+" searching an element");


    }
}
