public class PokemonGame
{
  public static void main(String[] args)
  {
    // CONSTRUCTOR 1, with arguments String, double
    Pokemon pikachu = new Pokemon("Pikachu", 100.0);
    System.out.println(pikachu.name);
    System.out.println(pikachu.health);

    // CONSTRUCTOR 2, with argument String
    Pokemon charmander = new Pokemon("Charmander");
    System.out.println(charmander.name);
    System.out.println(charmander.health);

    // CONSTRUCTOR 3, with no arguments
    Pokemon squirtle = new Pokemon();

    // constructors give values to all instance variables
    // if we don't initialize a particular instance variable, Java will give it
    // a default value which in this case was null
    System.out.println(squirtle.name);
    System.out.println(squirtle.health);

    squirtle.name = "Squirtle";
    System.out.println(squirtle.name);
  }
}
