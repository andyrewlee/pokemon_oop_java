public class PassByReference
{
  public static void main(String[] args)
  {
    int x = 0;
    int y = 0;

    if(x == y)
    {
      System.out.println("x and y are equal");
    }
    else
    {
      System.out.println("x and y are NOT equal");
    }

    // Strings are special in java, they are designed to be in between primities
    // and a class type. Even though these two Strings are in different
    // locations in memory, java knows that they are equal when we use the ==
    // operator unlike other class types
    String foo = "hello";
    String bar = "hello";

    if(foo == bar)
    {
      System.out.println("foo and bar are equal");
    }
    else
    {
      System.out.println("foo and bar are NOT equal");
    }

    // Although these arrays look identical
    // they live in different parts of memory
    String[] words = {"hello", "what"};
    String[] werds = {"hello", "what"};

    if(words == werds)
    {
      System.out.println("words and werds are equal");
    }
    else
    {
      System.out.println("words and werds are NOT equal");
    }

    // Although these two dojos have the same name
    // they are two different instances of CodingDojo living in a different
    // location in memory
    CodingDojo sanJose = new CodingDojo("San Jose");
    CodingDojo siliconValley = new CodingDojo("San Jose");

    if(sanJose == siliconValley)
    {
      System.out.println("sanJose and siliconValley are equal");
    }
    else
    {
      System.out.println("sanJose and silicionValley are NOT equal");
    }

    if(sanJose.equals(siliconValley))
    {
      System.out.println("sanJose and siliconValley are equal");
    }
    else
    {
      System.out.println("sanJose and silicionValley are NOT equal");
    }
  }
}
