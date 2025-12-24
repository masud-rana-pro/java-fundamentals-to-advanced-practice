/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type_casting;

/**
 *
 * @author Md. Masud Rana
 */
public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        //car to int
        char c ='A';
        int charToInt = c;
        System.out.println("Char to int casting " + charToInt );
        
        //int to char 
        int integer = 65;
        char intToChar = (char) integer;
        System.out.println("Int to char casting " + intToChar);
        //another way
        System.out.println(Character.toChars(integer));
        
        //String to character
        String  string ="Masud";
        char character = 'A';
        for (int i = 0; i < string.length(); i++) {
          character = (char) string.charAt(i);
        }
        System.out.print("Print the value of " + character);
        
        //character to string
        char characterM = 'M';
        System.out.println("Character to string cast " + String.valueOf(characterM));
        
        //int to double wedening
        int int2 = 15;
        double intToDbl = int2;
        System.out.println("Int to Double wedening value is " + intToDbl);
        
        //double to int narrowing
        double dbl = 20.5;
        int dblToInt = (int) dbl;
        System.out.println("Double to int narrowing value is " + dblToInt);
        
        //byte to byte
        byte b = 127;
        byte bb = 3;
        byte bbb = (byte) (b + bb);
        System.out.println("The value of byte + byte is " + bbb);
        
        //narrowing and wedening between float to int
        int int3 = 29;
        float f2 = int3;
        System.out.println(f2);
        int int4 = (int) f2;
        System.out.println(int4);
        
        
    }
   
}
