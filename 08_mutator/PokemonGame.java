public class PokemonGame
{
  public static void main(String[] args)
  {
    Pokedex pokedex = new Pokedex();

    Pokemon pikachu = new Pokemon("Pikachu");

    // using mutator (setter) to change the value of name
    pikachu.setName("Pikachoo");

    pokedex.printInformationFor(pikachu);
  }
}
