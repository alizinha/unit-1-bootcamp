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

    System.out.println(alarmClock(1, false));//will print "7:00" because Monday and not a holiday
    System.out.println(alarmClock(6, true));//will print "off" because Saturday and IS a holiday
    System.out.println(alarmClock(15, true));//will print "Please enter a number..." because method was supplied a number outside of 0 thru 6.
    

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

}
