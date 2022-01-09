import java.util.Scanner;

public class BitOperator{
    // to use bitwise operator for swaping
    static byte a;
    static byte b;

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        a = scn.nextByte();
        b = scn.nextByte();

        a = (byte)(a^b);
        b = (byte) (a^b);
        a = (byte)(a^b);

        System.out.println(a +"\t"+ b);

    }
}