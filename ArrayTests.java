import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testRIPMulipleInputs(){
    int[] input1 = {3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3}, input1);
  }

  @Test
  public void testRMultipleInputs() {
    int[] input1 = {3, 4};
    assertArrayEquals(new int[]{4, 3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAWL() {
    double[] input1 = {5.0, 10.0, 15.0, 0.0, 0.0};
    assertEquals(10.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testAWL2() {
    double[] input1 = {4.0, 4.0, 4.2, 4.2};
    assertEquals(4.2, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}
