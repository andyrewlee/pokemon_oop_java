public class PokemonGame
{
  public static void main(String[] args)
  {
    // we can invoke startSong without creating an instance of Pokemon
    // instead we can reference it directly inside of Pokemon
    Pokemon.startSong();

    // we can get POKEMON_NUMBER without creating instances of Bulbasaur because
    // it is a static variable that is not tied to the instance but to the class
    // itself
    System.out.println(Bulbasaur.POKEMON_NUMBER);
    System.out.println(Charmander.POKEMON_NUMBER);
    System.out.println(Squirtle.POKEMON_NUMBER);
    System.out.println(Pikachu.POKEMON_NUMBER);
  }
}
