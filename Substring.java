import java.util.ArrayList;
import java.util.Scanner;

class substring{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str;
        str = scn.nextLine();

        ArrayList<String> list = new ArrayList<String>();
        list = getSubstring(str);
        System.out.println();
        for (String item:list){
            System.out.print( "\t"+item);
        }
    }

    public static ArrayList<String> getSubstring(String str){
        if(str.length() == 0){
            ArrayList<String> blank = new ArrayList<String>();
            blank.add("");
            return blank;
        }
        ArrayList<String> ans = new ArrayList<String>();
        char first = str.charAt(0);
        ans = getSubstring(str.substring(1));
        ArrayList<String> myAns = new ArrayList<String>();

        for (String a:ans){
            myAns.add(""+a);
            myAns.add(first + a);
        }
        return myAns;
    }
}