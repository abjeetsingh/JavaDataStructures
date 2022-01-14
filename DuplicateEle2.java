import java.util.*;

public class DuplicateEle2{
        
    public static void getAns(byte[] arr){
        byte ans = 0;
        for (byte i=0; i<10; i++){
            ans = (byte)(ans^arr[i]);
        }
        System.out.println(ans);
        byte temp=0;
        byte rsbm = (byte)(ans & -ans);
        
        for (byte i=0; i<10; i++){
            if ((arr[i] & rsbm) == rsbm )
            temp = (byte)(arr[i] ^ temp);
        }

        ans = (byte)(ans^temp);
        System.out.println(temp);
        System.out.println(ans);
    }
    
    
    public static void main(String[] args)
        {
            byte[] arr = new byte[10];
            Scanner scn = new Scanner(System.in);
            
            for (byte i=0;i<10;++i)
            {
                System.out.println("Enter element " + (i+1)  + " in the array");
                byte temp = scn.nextByte();
                arr[i] = temp;
            }
            getAns(arr);
            scn.close();
        }
}