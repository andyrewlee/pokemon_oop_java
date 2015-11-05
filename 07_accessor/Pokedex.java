public class Pokedex
{
  public String getInformationFor(Pokemon pokemon)
  {
    // instead of accessing instance variables directly
    // we are using the accessor (getter) that we implemented
    return pokemon.getName() + " has " + pokemon.getName();
  }

  public void printInformationFor(Pokemon pokemon)
  {
    System.out.println(getInformationFor(pokemon));
  }
}
