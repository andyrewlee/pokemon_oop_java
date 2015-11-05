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

  public String getName()
  {
    return name;
  }

  public double getHealth()
  {
    return health;
  }

  // public method that changes data stored in private instance variable is
  // called a mutator (or a setter)
  public void setName(String newName)
  {
    name = newName;
  }

  public void setHealth(double newHealth)
  {
    health = newHealth;
  }
}
