/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {
    System.out.println(cigarParty(61, false));//will print FALSE because not between 40-60 and not the weekend
    System.out.println(cigarParty(1000, true));//will print TRUE because above 40 and IS the weekend
    System.out.println(cigarParty(45, false));//will print TRUE because between 40-60 and is not the weekend

    System.out.println(caughtSpeeding(95, true));//will print "2" because that speed is a 2 even on birthday
    System.out.println(caughtSpeeding(63, true));//will print "0" because that speed is a 0 on birthday
    System.out.println(caughtSpeeding(63, false));//will print "1" because that same speed is a 1 when NOT birthday

    System.out.println(caughtSpeeding2(95, true));//will print "2" because that speed is a 2 even on birthday
    System.out.println(caughtSpeeding2(63, true));//will print "0" because that speed is a 0 on birthday
    System.out.println(caughtSpeeding2(63, false));//will print "1" because that same speed is a 1 when NOT birthday

    System.out.println(alarmClock(1, false));//will print "7:00" because Monday and not a holiday
    System.out.println(alarmClock(6, true));//will print "off" because Saturday and IS a holiday
    System.out.println(alarmClock(15, true));//will print "Please enter a number..." because method was supplied a number outside of 0 thru 6.

    System.out.println(lotteryTicket(5, 5, 5));//will print "20" because all 3 ints the same
    System.out.println(lotteryTicket(5, 2, 5));//will print "10" because only 2 ints are the same
    System.out.println(lotteryTicket(1, 2, 3));//will print "0" because none of the ints are the same

    System.out.println(blackjack(21, 21));//will print 21 because both are within the limit
    System.out.println(blackjack(1, 2));//will print 2 because it's the higher
    System.out.println(blackjack(22, 23));//will print 0 because both are too high
    System.out.println(blackjack(2, 100));//will print 2 because 100 is too high

    System.out.println(evenlySpaced(2, 4, 6));//will print true
    System.out.println(evenlySpaced(2, 6, 4));//will print true
    System.out.println(evenlySpaced(3, 4, 6));//will print false

  }
// EXERCISES++

//  PROBLEM #1: Cigar Party
//  When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the
//  number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper
//  bound on the number of cigars. Write a method called cigarParty that takes an int (the number of cigars) and
//  boolean (whether or not it is the weekend) as parameters, and returns true if the party with the given values
//  is successful, or false otherwise.

  public static boolean cigarParty(int n, boolean weekend) {
    if ((n >=40 && n <=60) && !weekend)
    return true;
    else if ((n>=40) && weekend)
      return true;
    else return false;
  }
// PROBLEM #2: Caught Speeding
//  You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an
// int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61
// and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day,
// your speed can be 5 higher in all cases.
//  caughtSpeeding(60, false) → 0
//  caughtSpeeding(65, false) → 1
//  caughtSpeeding(65, true) → 0

  //This was my original answer before I discussed with Davis about how I could optimize my code:
  public static int caughtSpeeding (int n, boolean birthday) {
    if (birthday == true) {
      if (n <=66)
        return 0;
      else if (n >= 67 && n <= 85)
        return 1;
      else return 2;
    }
    else {
      if (n<=60)
        return 0;
      else if (n >= 61 && n <=80)
        return 1;
      else return 2;
    }
  }

  //Here's my new answer to same problem after optimizing my code:
  public static int caughtSpeeding2(int n, boolean birthday) {
    int mph_low = 60;
    int mph_high = 80;

    if (birthday == true){
      mph_low = mph_low + 5;
      mph_high = mph_high + 5;
    }
    if  ( n <= mph_low ){
      return 0;
    } else if ( n > mph_low && n <= mph_high ) {
      return 1;
    } else {
      return 2;
    }
  }

//  PROBLEM #3: Alarm Clock
//  Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
// return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
// and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and
// weekends it should be "off".
//  Examples: alarmClock(1, false) → "7:00"
//            alarmClock(5, false) → "7:00"
//            alarmClock(0, false) → "10:00"
  public static String alarmClock(int dayOfWeek, boolean vacation) {
    if (vacation == false) {
      if (dayOfWeek >= 1 && dayOfWeek <= 5)
        return "7:00";
      else if (dayOfWeek == 0 || dayOfWeek == 6)
        return "10:00";
      else return "Please enter a number between 0 and 6 where 0 = Sun, 1 = Mon, etc.";
    }
    else {
      if (dayOfWeek >= 1 && dayOfWeek <=5)
        return "10:00";
      else if (dayOfWeek == 0 || dayOfWeek == 6)
        return "off";
      else return "Please enter a number between 0 and 6 where 0 = Sun, 1 = Mon, etc.";

    }
  }
//
//  PROBLEM #4: Lottery Ticket
//  You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is
//  0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10. Write a method
//  that takes 3 ints as parameters and returns the correct result.
  public static int lotteryTicket(int a, int b, int c) {
    if ((a != b) && (b != c) && (a != c))
      return 0;
    else if ((a == b) && (b == c))
      return 20;
    else return 10;
  }
//  PROBLEM #5: Blackjack
//  Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
//  blackjack(19, 21) → 21
//  blackjack(21, 19) → 21
//  blackjack(19, 22) → 19
  public static int blackjack(int a, int b) {
    if ((a > 21) && (b > 21))
      return 0;
    else if (a > 21)
      return b;
    else if (b > 21)
      return a;
    else if (a > b)
      return a;
    else return b;
    }
//  PROBLEM # 6: Evenly Spaced
//  Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly
//  spaced, so the difference between small and medium is the same as the difference between medium and large.
//  evenlySpaced(2, 4, 6) → true
//  evenlySpaced(4, 6, 2) → true
//  evenlySpaced(4, 6, 3) → false
  public static boolean evenlySpaced (int a, int b, int c) {
    int big;
    int medium;
    int small;

    if ((a > b) && (a > c))
    {
      big = a;
      if(b > c)
      {
        medium = b;
        small = c;
      } else
      {
        medium = c;
        small = b;
      }
    } else if ((b > a) && (b > c))
    {
      big = b;
      if (a > c) {
        medium = a;
        small = c;
      } else {
        medium = c;
        small = a;
      }

      } else {
      big = c;
         if (a > b) {
           medium = a;
           small = b;
         } else {
           medium = b;
           small = a;
         }
      }
    return (big - medium) == (medium - small);

  }



  }








