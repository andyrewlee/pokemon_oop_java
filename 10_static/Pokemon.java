public class Pokemon
{
  private String name;
  private double health;

  public static void startSong()
  {
    System.out.println("I wanna be the very best like no one ever was~~");
  }

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
