/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {
    System.out.println(findTheSquare(2));
    System.out.println(squareRoot(5));
    System.out.println(toLowerCase());
    System.out.println(isMultiple(3, 12));//will return TRUE because 12 is a multiple of 3
    System.out.println(isMultiple(3, 13));//will return FALSE because 13 is not a multiple of 3


  }

//  PROBLEM #1: Calculate Square
//  Write a method called calculateSquare that takes an int as a parameter and returns the square of that integer.
//          ex: calculateSquare(2) returns 4
  public static int findTheSquare(int n)
  {
    return n * n;
  }

//    PROBLEM #2: Write a method called calculateSquareRoot that takes an int as a parameter and returns the
//    square root of that integer.
//    ex: calculateSquareRoot(4) returns 2
    public static double squareRoot(double n)
    {
      return Math.sqrt(n);
      //NOTE: The directions specified "int" but I used "double" instead because Math.sqrt method needs a double.
    }

//  PROBLEM #3:  toLowerCase
//  Write a method called toLowerCase that takes a String as a parameter and returns the String in lower case.
//  ex: toLowerCase("Hello, World!") returns "hello, world!"
  public static String toLowerCase() {
    String getLow = "Hello, World!";
    return getLow.toLowerCase();
  }
//  4. isMultiple
//  Write a method called isMultiple that takes 2 int parameters and determines if the second is a multiple of the first.
//  ex: isMultiple(2, 3) returns false
//  isMultiple(2, 4) returns true
//  isMultiple(5, 100) returns true
//  isMultiple(5, 101) returns false
  public static boolean isMultiple(int a, int b) {
    return b % a == 0;
  }

//  PROBLEM #5: Pretty Integer
// Write a method called prettyInteger that takes an int as a parameter and prints the integer
// surrounded by asterisks with the length of each side equal to the given integer.
//  ex: prettyInteger(4) prints "**** 4 ****"
//  prettyInteger(10) prints "********** 10 **********"
//  Hint: this method does not return anything!
//todo: this problem prettyInteger
  public static void prettyInteger(int n) {
    String asterisk = "*";
    for (int i = 0; i <= n; i++) {

    }
    System.out.println();
  }
}
