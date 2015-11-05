public class Pokedex
{
  // there are two kinds of methods
  // those that return a single value or object
  // and those that don't return anything

  // this is a kind of method that returns a String
  // this is an instance method: we call it on an instance of Pokedex
  public String getInformationFor(Pokemon pokemon)
  {
    return pokemon.name + " has " + pokemon.health;
  }

  // this is a kind of method that returns void (nothing)
  // this is an instance method: we call it on an instance of Pokedex
  public void printInformationFor(Pokemon pokemon)
  {
    System.out.println(getInformationFor(pokemon));
  }
}
