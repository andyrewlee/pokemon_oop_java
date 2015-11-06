// inheritance allows us to define general class
// then later define more specialized classes
public class Pokemon
{
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

  // accessor methods
  public String getName()
  {
    return name;
  }

  public double getHealth()
  {
    return health;
  }

  // mutator methods
  public void setName(String newName)
  {
    name = newName;
  }

  public void setHealth(double newHealth)
  {
    health = newHealth;
  }
}
