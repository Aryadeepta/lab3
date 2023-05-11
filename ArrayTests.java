import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2=new int[]{3,2,1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{1,2,3}, input2);
    int[] input3=new int[]{6,5,4,3,2,1};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{1,2,3,4,5,6}, input3);
    
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{1,2,3}, ArrayExamples.reversed(new int[]{3,2,1}));
    assertArrayEquals(new int[]{1,2,3,4,5,6}, ArrayExamples.reversed(new int[]{6,5,4,3,2,1}));
  }
  @Test
  public void testAverageWithoutLowest(){
    assertEquals(5.0/2.0,ArrayExamples.averageWithoutLowest(new double[]{1.0,2.0,3.0}),.0001);
    assertEquals(5.0,ArrayExamples.averageWithoutLowest(new double[]{5.0,2.0,2.0,5.0,2.0}),.0001);
  }
}
