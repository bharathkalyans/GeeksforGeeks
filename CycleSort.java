public class CycleSort {

    public void cycleSort(int arr[],int n){
        // count number of memory writes
        int writes = 0;

        // traverse array elements and put it to on
        // the right place
        for (int cycle_start=0; cycle_start<=n-2; cycle_start++)
        {
            // initialize item as starting point
            int item = arr[cycle_start];

            // Find position where we put the item. We basically
            // count all smaller elements on right side of item.
            int pos = cycle_start;
            for (int i = cycle_start+1; i<n; i++)
                if (arr[i] < item)
                    pos++;

            // If item is already in correct position
            if (pos == cycle_start)
                continue;

            // ignore all duplicate elements
            while (item == arr[pos])//If the same element is present which is a Duplicate
                pos += 1;           //then go to the next Position!!! Simple right

            // put the item to it\'s right position
            if (pos != cycle_start)
            {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                writes++;
            }

            // Rotate rest of the cycle
            while (pos != cycle_start)
            {
                pos = cycle_start;

                // Find position where we put the element
                for (int i = cycle_start+1; i<n; i++)
                    if (arr[i] < item)
                        pos += 1;

                // ignore all duplicate elements
                while (item == arr[pos])
                    pos += 1;

                // put the item to it\'s right position
                if (item != arr[pos])
                {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                    writes++;
                }
            }
        }
//        for(int cs=0;cs<n-1;cs++){ //cs~cycle start
//
//            int item=arr[cs];
//            int pos=cs;
//            for(int i=cs+1;i<n;i++){
//                if(arr[i]<item)
//                    pos++;
//            }
//            int temp=item;//Swapping(item,arr[pos])
//            item=arr[pos];
//            arr[pos]=temp;
//
//            while(pos!=cs){
//                pos=cs;
//                for(int j=cs+1;j<n;j++) {
//                    if (arr[j] < item)
//                        pos++;
//                }
//
//                    int temp2=item;
//                    item=arr[pos];
//                    arr[pos]=temp;
//
//            }
//
//        }


    }


    public static void main(String args[]){
        System.out.println("---------------Cycle Sort--------------------");
        CycleSort c=new CycleSort();
        int[] a={2,45,-1,1,7};
        c.cycleSort(a,a.length);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
