public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;

  // Non-default Dog constructor
  public Dog(String name)
  {
    this name = name;
    numDogs++
    this.ID = numDogs * numDogs;
  }

  // Default Dog constructor

  // Setters - instance variables only
  publuc void setName(String iName)
  {
    name = iName;
  }

  public void setID(int ID)
  {
    this.ID = ID;
  }

  // Getters - instance variables only
public String getName()
{
  return name;
}

publuc int getID()
{
  return ID;
}
  // method getNumDogs

  public static int getNumDogs()
  {
    return numDogs;
  }
}
