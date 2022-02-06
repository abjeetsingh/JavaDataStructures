import java.util.*;
class PrintKPC{
                                        // 0     1      2      3    4   5       6      7   8       9
    static String[] codes = new String[]{ "?@","abc","def","ghi","jkl","mnop","qrst","uv","wxyz", ",:"};
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String Typed = scn.nextLine();
    getKPC(Typed,"");
    scn.close();
    }

    public static void getKPC(String Typed, String Toprint){

        if(Typed.length() == 0){
            System.out.println(Toprint);
            return;
        }

        String codeString = codes[Typed.charAt(0) - '0'];

        for(int i=0; i< codeString.length(); ++i)
        {
            char chosen = codeString.charAt(i);
            getKPC(Typed.substring(1), Toprint + chosen);
        }
        



    }
}