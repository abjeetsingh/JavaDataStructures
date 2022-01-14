import java.util.*;

public class DuplicateEle{
    static byte[] num = new byte[10];

    public static byte Duplicate(byte[] num){
        byte ans = 0;
        for (byte i=0;i<9;++i)
            ans = (byte)(ans ^ num[i]);
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        for (byte i=0; i<9; i++){
            byte temp = scn.nextByte();
            num[i] = temp;
        }

        for (byte x :num)
            System.out.println(x);

        byte ans = Duplicate(num);

        System.out.println("the answer is" + ans);
        scn.close();
    }
}