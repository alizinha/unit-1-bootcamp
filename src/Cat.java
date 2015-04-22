/**
 * Created by alexandraqin on 4/14/15.  Allison worked on answers on 4/19/15.
 */
public class Cat {

  private String name;
  private String favoriteFood;
  private int age;
  private Person owner;



  public Cat() {
  }

  public Cat(String myName) {
    name = myName;
  }

  public Cat(String name,int age){

  }

  public String getFavoriteFood() {
    return favoriteFood;
  }

  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public Person getOwner() {
    return owner;
  }

//Exercises
  //        1. Cool cats
  //        Create 3 cats named Garfield, Pink Panther, and Catwoman.
  //        Assign each of them a favorite food (Garfield's favorite food should be Lasagna).
  //        Assign each of them an age.

//        2. isOlder
//
//        Write a method called isOlder that takes 2 Cats as parameters and returns whether or not the first Cat is older
// than the second.
//        ex: // if Garfield is 9 years old and Catwoman is 10 years old
//        isOlder(garfield, catwoman) returns false

  public static boolean isOlder(Cat first, Cat second)
  {
  return first.getAge() > second.getAge();
  }

//        3. Best Friends
//        Write a method called makeBestFriends that takes 2 Cats as parameters and sets both of their favorite foods to
//        the same thing.
//        Hint: this method does not return anything!
  public static void makeBestFriends(Cat first, Cat second) {
    second.setFavoriteFood(first.getFavoriteFood());
  }


//        4. Kitten
//        Write a method called makeKitten that takes 2 Cats as parameters and returns a new Cat with a name that is the
//        combination of the 2 parent Cats' names. The age of the new Cat should be 0.
//        ex: makeKitten(garfield, catwoman) returns a Cat named "GarfieldCatwoman" with age 0

  public static Cat makeKitten(Cat first, Cat second) {
    Cat kitten = new Cat(first.getName() + second.getName());
    kitten.setAge(0);
    return kitten;
  }


//        5. Adoption
//        Write a method called adoption that takes 1 Cat and 1 Person as a parameter and sets the Cat's owner to be the Person.
//        ex: Person jon = Person('Jon');
//        adoption(garfield, jon); // Jon is now Garfield's owner!
//        Hint: this method does not return anything!
//        Bonus Challenge (to problem #5)
//        If the Cat's name is Catwoman, don't set the owner, but instead print: "Catwoman will never be anyone's pet!"
//
  public static void catAdoption (Cat cat, Person person) {
    if ("Catwoman".equalsIgnoreCase(cat.getName())) {
      System.out.println("Catwoman will never be anyone's pet!");
    } else cat.setOwner(person);
  }



//        6. isFree
//        Write a method called isFree that checks whether or not a Cat has an owner.
//        ex: isFree(garfield) returns false
  public static boolean isFree(Cat cat) {
    return cat.getOwner() == null;
  }


//        7. isSibling
//        Write a method called isSibling that checks whether or not 2 Cats have the same owner.
   public static boolean isSibling(Cat first, Cat second) {
     return first.getOwner() == second.getOwner();
   }

//  DATA STRUCTURE EXERCISES!
//          1. Cool Cats Pt. II
//  Create an ArrayList of 5 Cats.
//  Use a loop to print the contents of each object in the ArrayList.






//  2. Most Frequent Element
//  Write a method called mostFrequentElement that takes an ArrayList of Integers and finds the most frequently occurring
// element in the ArrayList. At the end print the element and its number of occurrences. If there is more than one such
// element, any one of them may be printed.
//  Bonus Challenge:
//  What needs to be changed to make this work on an array of Strings?








//  3. Pod HashMap
//  Create a HashMap that maps the names of all the Access Coders in your Pod to their age.
//  Use a loop to print each key-value pair of the HashMap.





//  4. canRentACar
//  Write a method called canRentACar that takes the Pod HashMap as a parameter and returns whether or not the
// Pod can rent a car. If one or more studetns is over 25, it should return true. If no one in the Pod is over 25,
// it should return false.





//  Exercises++ (for Data Structures section)
//          5. wordsWithoutList
//
//  Given an array of strings and an integer, write a method that return a an ArrayList where all the strings of the given
// length are omitted.
//  wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
//  wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
//  wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}




//  6. How many clumps?
//  Say that a "clump" in an ArrayList is a series of 2 or more adjacent elements of the same value. Write a method
// that returns the number of clumps in the given ArrayList.
//  countClumps({1, 2, 2, 3, 4, 4}) → 2
//  countClumps({1, 1, 2, 1, 1}) → 2
//  countClumps({1, 1, 1, 1, 1}) → 1


//          7. Sorting sentences
//  Write a method that takes a String sentence, breaks it up into an ArrayList of Strings (one word per ArrayList element),
// and prints out the words in alphabetical order.



}
