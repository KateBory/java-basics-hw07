/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    // TODO fill in code here using for loop and replace the return statement
    int result = 0;
    for(int i=lowerBound; i <= upperBound; i++) {
      result += i;
    }
    return result;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    int result = 0;
    for (int i =0; i < numbers.length; i++) {
      result += numbers[i];
    }
    return result;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {

    return (double)sum(lowerBound, upperBound) / ( upperBound - lowerBound + 1);
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    return (double)sum(numbers) / numbers.length;
  }
}