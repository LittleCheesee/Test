
package casting01;

import java.util.Scanner;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
    
        //byte x = 128;
         
         
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte

        short y = 128;
        y = (byte)y;
        System.out.println(y);
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        
        byte z = 127;
        System.out.println(z + 1);
        System.out.println(z + 2);
        
    }    
}
