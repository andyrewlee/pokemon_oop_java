public class Pokemon
{
  // instance variables
  public String name;
  public double health;

  // CONSTRUCTOR 1
  // constructor is special method that is called when using new operator
  // constructor performs initializing actions (i.e. setting instance variables)
  // constructors have same name as its class
  // returns a reference to (memory address) of an object
  public Pokemon(String newName, double newHealth)
  {
    name = newName;
    health = newHealth;
  }

  // CONSTRUCTOR 2
  // within one class, we can have two or more definitions of a method with same
  // name but with different parameters (overloading)

  // contructor is a special type of method, methods are blocks of code
  // associated with a particular class (will go over more later)
  //
  // when we refer to instance variables within a class we are actually
  // accessing an instance variable of this (current object)

  // we can omit the keyword this, since java can infer we are referring to the
  // instance variable but we are actually accessing this name and this health
  public Pokemon(String newName)
  {
    this.name = newName;
    this.health = 100;
  }

  // CONSTRUCTOR 3
  public Pokemon()
  {
    health = 100;
  }
}
