public abstract class Pokemon
{
  private String name;
  private double health;
  private Move[] moves;
  private ElementType type;

  public static final double[][] EFFECTIVENESS_MATRIX = {
    {0.5, 0.5, 2, 1, 1,},
    {2, 0.5, 0.5, 1, 1},
    {0.5, 2, 0.5, 1, 1},
    {1, 2, 0.5, 0.5, 1},
    {1, 1, 1, 1, 1, 1}
  };

  public static void startSong()
  {
    System.out.println("I wanna be the very best like no one ever was~~");
  }

  public Pokemon(String newName, Move[] newMoves, ElementType newType)
  {
    name = newName;
    moves = newMoves;
    type = newType;
    health = 100;
  }

  // accessor methods
  public String getName()
  {
    return name;
  }

  public double getHealth()
  {
    return health;
  }

  public ElementType getType()
  {
    return type;
  }

  // mutator methods
  public void setName(String newName)
  {
    name = newName;
  }

  public void setHealth(double newHealth)
  {
    health = newHealth;
  }

  public void setMove(int moveIndex, Move newMove)
  {
    moves[moveIndex] = newMove;
  }

  // instance methods
  public int findIndexOfElementType(ElementType type)
  {
    int moveIndex;
    switch(type)
    {
      case FIRE:
        moveIndex = 0;
        break;
      case WATER:
        moveIndex = 1;
        break;
      case GRASS:
        moveIndex = 2;
        break;
      case ELECTRIC:
        moveIndex = 3;
        break;
      default:
        moveIndex = 4;
        break;
    }
    return moveIndex;
  }

  public double calculateEffectiveness(ElementType attackType, ElementType pokemonType)
  {
    int attackTypeIndex = findIndexOfElementType(attackType);
    int pokemonTypeIndex = findIndexOfElementType(pokemonType);

    return EFFECTIVENESS_MATRIX[attackTypeIndex][pokemonTypeIndex];
  }

  public void attack(int moveIndex, Pokemon otherPokemon)
  {
    Move move = moves[moveIndex];

    if(move.didHit())
    {
      int baseDamage = move.getDamage();
      double effectiveness = calculateEffectiveness(move.getType(), otherPokemon.getType());
      double totalDamage = baseDamage * effectiveness;

      double currentHealth = otherPokemon.getHealth();
      double newHealth = currentHealth - totalDamage;

      otherPokemon.setHealth(newHealth);

      System.out.println(name + " used " + move.getName() + " and did " +
                         totalDamage + " damage to " + otherPokemon.getName());
    }
    else
    {
      System.out.println(name + "missed " + otherPokemon.getName());
    }
  }
}
