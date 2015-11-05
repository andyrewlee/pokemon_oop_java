public class Pokemon
{
  // we can't access instance variables directly outside of the class
  // implementation when we mark them as private

  // convention to make instance variables private so that we can do any
  // necessary checks before a user tries to alter the instance variables
  private String name;
  private double health;

  public Pokemon(String newName, double newHealth)
  {
    name = newName;
    health = newHealth;
  }

  public Pokemon(String newName)
  {
    name = newName;
    health = 100;
  }

  public Pokemon()
  {
    health = 100;
  }

  // accessor method (or getter) is a method that allows us to look at data
  // inside of an instance variable
  public String getName()
  {
    return name;
  }

  public double getHealth()
  {
    return health;
  }
}
