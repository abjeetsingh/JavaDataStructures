import java.util.*;
public class BitEvenOdd{
    static byte num1;

    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        num1 = scn.nextByte();

        if((num1 & 1) == 0)
            System.out.println(num1 +"is even");
        else
            System.out.println(num1 + "is odd");
        scn.close();
    }
}