public class Pokedex
{
  public String getInformationFor(Pokemon pokemon)
  {
    return pokemon.name + " has " + pokemon.health;
  }

  // similar to instance variables
  // if we call a method that matches the name if an instance variable
  // we are calling the instance method on this, which is current object
  // java adds the keyword this before by default so we can omit the this
  // keyword but once again it is important to know that java is sending the
  // method to this behind the scenes
  public void printInformationFor(Pokemon pokemon)
  {
    System.out.println(this.getInformationFor(pokemon));
  }
}
