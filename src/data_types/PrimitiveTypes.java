
package data_types;

/**
 *This is demonstrates the 8 types of primitive data type of java and defining .
 * Primitive data types ( 8 Types )
 * i. Numeric Type 
 *     I. Integer Type  
 *         1. byte 
 *         2. Short
 *         3. int
 *         4. long
 *     II. Floating Point Type
 *         5. float
 *         6. double
 * ii. Non-numeric Type 
 *     1. boolean
 *     2. char
 * 
 * @author Md. Masud Rana
 */
public class PrimitiveTypes {
    
    //Declearation of variables with primitive data types access modifire(static)
    static byte byteType = 5;//Byte
    static short shortType = 499;//Short
    static int integerType = 98725;// Integer (whole number)
    static long longType = 7823649234323235l;//long
    static float floatType = 3463876.25f;// Floating point number
    static double doubleType = 940345.24;//Double
    static boolean booleanType = true;// Boolean
    static char charType = 'A';// Character
    
    public static void main(String[] args) {
        // Printing the value of the variables
        System.out.println("The value of Byte type is : " + byteType);
        System.out.println("The value of Short type is : " + shortType);
        System.out.println("The value of Integer type is : " + integerType);
        System.out.println("The value of Long type is : " + longType);
        System.out.println("The value of Float type is : " + floatType);
        System.out.println("The value of Double type is : " + doubleType);
        System.out.println("The value of Boolean type is : " + booleanType);
        System.out.println("The value of Character type is : " + charType);
    }
}
