package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int sum(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    return sum;
  }

  public double average(int[] numbers) {
    int sum = sum(numbers);
    return (double) sum / numbers.length;
  }

  public int addOddNumbers(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
      if (num % 2 != 0) {
        sum += num;
      }
    }
    return sum;
  }

  public int addEvenNumbers(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
      if (num % 2 == 0) {
        sum += num;
      }
    }
    return sum;
  }
}
