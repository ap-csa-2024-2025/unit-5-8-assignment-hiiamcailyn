import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Dog dog1 = new Dog();
    dog1.setName("ily");
    System.out.println(dog1.getName());
    Dog dog2 = new Dog();
    dog2.setName("pp");
    System.out.println(dog2.getName());

   /// System.out.println(Dog.getNmae()); I expect to see that the Dog will cause the code to not print out because Dog is a class.


    Scanner sc = new Scanner(System.in);
    String input = "";
    while (!input.equals("q"))
    {
      System.out.println("Input the make of the car, \"default\" to create a default car or \"q\" to quit:");
      input = sc.nextLine();
      if (input.equals("default"))
      {
        // create default car
      }
      else
      {
        // ask for model, year, miles per gallon
      }

      System.out.println(); // print out the car object
    }
  }
}
