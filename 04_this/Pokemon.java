public class Pokemon
{
  // if we define instance methods
  public String name;
  public double health;

  public Pokemon(String newName, double newHealth)
  {
    // we can set the instance methods by asking this
    // this is a keyword that represents the current object
    // however this behavior is so common that java infers we are referencing
    // this if we refer to a variable name that matches the instance variable
    // therefore we can omit this
    this.name = newName;
    this.health = newHealth;
  }

  public Pokemon(String newName)
  {
    // it is important to note however java is adding the keyword this before we
    // reference the instance variables
    this.name = newName;
    this.health = 100;
  }

  public Pokemon()
  {
    this.health = 100;
  }
}
