public class CodingDojo
{
  public String name;

  public CodingDojo(String newName)
  {
    name = newName;
  }

  // when we compare two objects with ==
  // we are checking if they have the same memory address

  // when defining a class
  // we should define a method for the class that is called equals that tests
  // objects to see whether they are equal

  // we should always name it equals
  // because if we don't, java will create one for us
  // and it might not have the behavior that we expect
  public boolean equals(CodingDojo otherDojo)
  {
    return name == otherDojo.name;
  }
}
