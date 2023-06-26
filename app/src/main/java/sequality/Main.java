package sequality;

public class Main {
  public static void main(String[] args) {
    Calculate calculate = new Calculate();

    System.out.println("Hello World!");

    int num1 = 2;
    int num2 = 3;
    int sum = calculate.sum(num1, num2);
    double average = calculate.average(num1, num2);
    System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum + ". Average is " + average + ".");

    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sumOfNumbers = calculate.sum(numbers);
    double averageOfNumbers = calculate.average(numbers);
    System.out.println("Sum of 1 to 10 is " + sumOfNumbers + ". Average is " + averageOfNumbers + ".");

    int sumOfOdd = calculate.addOddNumbers(numbers);
    int sumOfEven = calculate.addEvenNumbers(numbers);
    System.out.println("Sum of odd of 1 to 10 is " + sumOfOdd + ". Sum of even is " + sumOfEven + ".");
  }
}
