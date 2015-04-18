/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops
{

  public static void main(String args[])
  {
    oneThruTen();//prints 1 thru 10, each number on separate line
    oneThruTenForLoop();//prints 1 thru 10, each number on separate line
    oneThruN(5);//prints 1 thru n (in this case, "5"), each number on separate line
    evenThruN(22);//prints even numbers 2 thru n (in this case, "22")
    evenThruN(21);//prints even numbers 2 thru n (in this case, "20" because "21" is odd not even)
    sumOfOneThruTen();//prints sum of 1 thru 10 --> 55
    sumOfOneThruTenWhileLoop();//prints sum of 1 thru 10 --> 55
    sumOfOneThruN(20);//prints 210 because sum of 1 thru 20 is 210 -- checked on WolframAlpha for accuracy
    sumofOneThruTenThousand();
    intStringPrint(5, "Allison");


  }
  //Exercises
  //
  //  1.      Write a method that prints the numbers 1 through 10 using a loop. -- 4:15pm, 4/18/15--took 5 minutes
  public static void oneThruTen() {
    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }

  }
  //    2.    Write a method that prints the numbers 1 through 10 using a different kind of loop. -- 4:21pm, 4/18/15--took 15 minutes
  //because I got stuck on int vs void and had to discuss with the T.A. (Joe)

  public static void oneThruTenForLoop() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  //     3.   Write a method that takes in an int n and prints the numbers 1 through n. -- 4:37pm, 4/18/15 -- took 2 minutes! :)
  public static void oneThruN (int n) {
    int i = 1;
    while (i <= n) {
      System.out.println(i);
      i++;
    }
  }
  //     4.   Write a method that takes in an int n and prints the even numbers 2 through n. -- 4:41pm, 4/18/15 -- took 5 minutes! :)
  public static void evenThruN (int n) {
    for (int i = 2; i <= n; i += 2) {
        System.out.println(i);
    }
  }
  //     5.   Write a method that prints the sum of 1 through 10 using a loop. -- 4:50pm, 4/18/15 -- had issues with this one
  //          Decided to make it both ways-- for loop AND while loop.
  public static void sumOfOneThruTen() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
  public static void sumOfOneThruTenWhileLoop() {
    int sum = 0;
    int i = 1;
    while (i <=10) {
      sum += i;
      i++;
    }
    System.out.println(sum);
  }

  //6. Write a method that takes in an int n and prints the sum of the numbers 1 through n using a loop. -- 5:42pm, 4/18/15 -- 3 minutes! :)
  public static void sumOfOneThruN(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
  //     7.   Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000. -- 5:46pm, 4/18/15 -- 4 minutes! :)
  public static void sumofOneThruTenThousand() {
    sumOfOneThruN(10000);
  }
  //     8.   Write a method that takes in an int n and a String s and prints out s on its own line, n times.
  //          If n is negative, print "". -- 5:50pm, 4/18/15 -- 5 minutes! :)
  public static void intStringPrint (int n, String s) {
    for (int i = 0; i < n; i++) {
      System.out.println(s);
    }
  }



  //     9.   Modify the method to print out the string concatenated with itself n times.
  //    10.   Write a method that prints the first ten Fibonnaci numbers.
  //    11.   Modify the method to sum the first ten Fibonnaci numbers.
  //    12.   Modify the method to take in an int n and sum the first n Fibonnaci numbers.


  //  EXERCISES++

  //          PROBLEM #1: sumNumbers -- 11:44am, 4/18/15
  //  Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series
  //  of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
  //  Integer.parseInt(string) converts a string to an int.)
  //  sumNumbers("abc123xyz") → 123
  //  sumNumbers("aa11b33") → 44
  //  sumNumbers("7 11") → 18
  //todo
  //  public static int sumNumbers(String sumNum) {
  //    for (int i = 0; i <= sumNum.length(); i++) {
  //
  //    }
  //
  //
  //  }


  //  PROBLEM #2: Is Not
  //  Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word
  //  "is" should not be immediately preceded or followed by a letter -- so for example the "is" in "this" does not count. (Note:
  //  Character.isLetter(char) tests if a char is a letter.)
  //  notReplace("is test") → "is not test"
  //  notReplace("is-is") → "is not-is not"
  //  notReplace("This is right") → "This is not right"


  //  PROBLEM #3: Between Words
  //  Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of
  // the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is
  // between two words.
  //  wordEnds("abcXY123XYijk", "XY") → "c13i"
  //  wordEnds("XY123XY", "XY") → "13"
  //  wordEnds("XY1XY", "XY") → "11"


  //  PROBLEM #4: Number Puzzle
  //  Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60, and whose difference is 14.


  //  PROBLEM #5: Digits
  //
  //  Use nested for loops to generate a list of all the positive two digit numbers. Display the numbers, and the sums of their digits.
  //
  //          10, 1+0 = 1
  //          11, 1+1 = 2
  //          12, 1+2 = 3
  //          13, 1+3 = 4
  //          14, 1+4 = 5
  //          15, 1+5 = 6
  //          16, 1+6 = 7
  //          17, 1+7 = 8
  //          18, 1+8 = 9
  //          19, 1+9 = 10
  //          20, 2+0 = 2
  //          21, 2+1 = 3
  //          22, 2+2 = 4
  //          (etc.)
  //          97, 9+7 = 16
  //          98, 9+8 = 17
  //          99, 9+9 = 18


}