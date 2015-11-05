public class PokemonGame
{
  public static void main(String[] args)
  {
    // if we don't define any constructors
    // java will create a constructor with no parameters for us
    // however this goes away once we define any constructor
    Pokedex pokedex = new Pokedex();

    Pokemon pikachu = new Pokemon("Pikachu");
    Pokemon charmander = new Pokemon("Charmander");
    Pokemon squirtle = new Pokemon("Squirtle");

    // getInformationFor is an instance method for Pokedex
    // which means it is a method we can call on an instance of Pokedex
    String infoAboutPikachu = pokedex.getInformationFor(pikachu);
    String infoAboutCharmander = pokedex.getInformationFor(charmander);
    String infoAboutSquirtle = pokedex.getInformationFor(squirtle);

    // getInformationFor returns a string which we can then print to the screen
    System.out.println(infoAboutPikachu);
    System.out.println(infoAboutCharmander);
    System.out.println(infoAboutSquirtle);

    // printInformationFor doesn't return anything but prints it directly
    pokedex.printInformationFor(pikachu);
    pokedex.printInformationFor(charmander);
    pokedex.printInformationFor(squirtle);
  }
}
