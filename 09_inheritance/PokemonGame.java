public class PokemonGame
{
  public static void main(String[] args)
  {
    Pokedex pokedex = new Pokedex();

    Pokemon pikachu = new Pikachu();
    Pokemon bulbasaur = new Bulbasaur();
    Pokemon charmander = new Charmander();
    Pokemon squirtle = new Squirtle();

    pokedex.printInformationFor(pikachu);
    pokedex.printInformationFor(bulbasaur);
    pokedex.printInformationFor(charmander);
    pokedex.printInformationFor(squirtle);
  }
}
