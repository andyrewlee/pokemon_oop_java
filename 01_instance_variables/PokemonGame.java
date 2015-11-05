// program is a class that has a method named main
public class PokemonGame
{
  public static void main(String[] args)
  {
    // create instance of Pokemon
    // an instance of a class is an object
    // variable pocketMonster references distince Pokemon object
    // new operator returns memory address of object and places instance
    // variables inside of the object
    Pokemon pocketMonster = new Pokemon();

    // set an instance variable by referencing object name followed by a dot
    // and instance variable's name
    pocketMonster.name = "Pikachu";

    // get value of instance variable by referencing object name followed by a
    // dot and instance variable's name
    System.out.println(pocketMonster.name);

    // we have not set health instance variable yet
    // java has given it a default value
    System.out.println(pocketMonster.health);

    // set health instance variable
    pocketMonster.health = 100;

    // get health instance variable
    System.out.println(pocketMonster.health);
  }
}
