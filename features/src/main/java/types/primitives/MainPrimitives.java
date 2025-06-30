package types.primitives;

public class MainPrimitives {

    // PRIMITIVES types goes to the stack, they are stored as values not reference
    /**  char */
    char charValue = 'C';

    /** The Java programming language also supports a few special escape sequences for char and String literals:
     * \b (backspace) delete previous char
     * \t (tab)
     * \n (line feed) NEW LINE
     * \f (form feed)
     * \r (carriage return) cursor GO BACK TO START OF LINE, erasing the line
     * \" (double quote)
     * \' (single quote)
     * \\ (backslash).
     */

    /**  boolean */
    boolean booleanValue= true;

    /**  numeric integer */
    byte byteValue = 127; //16-bit
    short shortValue = 10000; //16-bit
    int intValue = 12; //32-bit
    long longValue = 23; //64-bit

    /**  numeric decimal */
    float floatValue = 2.345F; //32-bit
    double doubleValue = 120.745987225D; //64-bit

    // void empty; void TYPE IS NOT ASSIGNABLE

    public static void main(String[] args) {
        System.out.println("---------------------[PRIMITIVES]----------------------");
        // PLAYGROUND FOR TEST: put here code to test this feature
        System.out.println("< char section >");
        System.out.println("This is a \"text\" but also this is a \'text\'");
        System.out.println("This is a  test for backspace \b\b\b\b\b\b\b hey don't delete this please");
        System.out.println("This is a  test for tab \t and here I am \\ what? \\");
        System.out.print("I want a new line: \n");
        System.out.print("Now end the line: \r");
        System.out.println("----Hey what are you doing? \f so now what?");

        int array;

    }

}
