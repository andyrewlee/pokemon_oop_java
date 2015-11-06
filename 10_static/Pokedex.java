public class Pokedex
{
  public String getInformationFor(Pokemon pokemon)
  {
    return pokemon.getName() + " has " + pokemon.getHealth();
  }

  public void printInformationFor(Pokemon pokemon)
  {
    System.out.println(getInformationFor(pokemon));
  }
}
