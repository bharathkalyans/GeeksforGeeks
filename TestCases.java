import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCases {
   insertionSort i;

   @Before
   public  void setUp(){
      i=new insertionSort();
   }

   @Test
   public void test1(){
      assertArrayEquals(new int[]{-999,-1,0,2,23,1000},i.InsertionSort(new int[]{23,-1,2,0,-999,1000}));

   }
@Test
   public void test(){

}



}
