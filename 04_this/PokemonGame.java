public class PokemonGame
{
  public static void main(String[] args)
  {
    Pokedex pokedex = new Pokedex();

    Pokemon pikachu = new Pokemon("Pikachu");
    Pokemon charmander = new Pokemon("Charmander");
    Pokemon squirtle = new Pokemon("Squirtle");

    String infoAboutPikachu = pokedex.getInformationFor(pikachu);
    String infoAboutCharmander = pokedex.getInformationFor(charmander);
    String infoAboutSquirtle = pokedex.getInformationFor(squirtle);

    System.out.println(infoAboutPikachu);
    System.out.println(infoAboutCharmander);
    System.out.println(infoAboutSquirtle);

    pokedex.printInformationFor(pikachu);
    pokedex.printInformationFor(charmander);
    pokedex.printInformationFor(squirtle);
  }
}
