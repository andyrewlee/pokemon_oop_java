public class Pokemon
{
  public String name;
  public double health;

  public Pokemon(String newName, double newHealth)
  {
    name = newName;
    health = newHealth;
  }

  public Pokemon(String newName)
  {
    this.name = newName;
    this.health = 100;
  }

  public Pokemon()
  {
    health = 100;
  }
}
