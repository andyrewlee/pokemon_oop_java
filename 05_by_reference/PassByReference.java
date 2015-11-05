public class PassByReference
{
  public static void main(String[] args)
  {
    // primitives (lower case types) are all passed by value
    int x = 0;
    int y = x;
    x = 7;
    System.out.println(y);

    // java Strings are immutable, so reassignment causes variable to point
    // to a new instance of String rather than changing the value of String
    String foo = "hello";
    String bar = foo;
    foo = "goodbye";
    System.out.println(bar);

    // Arrays are passed by reference
    String[] words = {"hello", "what"};
    String[] werds = words;
    words[0] = "yee";
    System.out.println(werds[0]);

    // All class types are passed by reference
    CodingDojo sanJose = new CodingDojo("San Jose");
    CodingDojo siliconValley = sanJose;
    sanJose.name = "Silicon Valley";
    System.out.println(siliconValley.name);
  }
}
