package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0.001);
  }

  @Test
  public void testSumOfNumbers() {
    Calculate calculate = new Calculate();
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int expected = 55;
    assertEquals(expected, calculate.sum(numbers));
  }

  @Test
  public void testAverageOfNumbers() {
    Calculate calculate = new Calculate();
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    double expected = 5.5;
    assertEquals(expected, calculate.average(numbers), 0.001);
  }

  @Test
  public void testSumOfOddNumbers() {
    Calculate calculate = new Calculate();
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int expected = 25;
    assertEquals(expected, calculate.addOddNumbers(numbers));
  }

  @Test
  public void testSumOfEvenNumbers() {
    Calculate calculate = new Calculate();
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int expected = 30;
    assertEquals(expected, calculate.addEvenNumbers(numbers));
  }
}
