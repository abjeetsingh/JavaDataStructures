import java.util.*;

class LongestPalindromicSubsting{

    public static void main(String[] args) {
        String str;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter string");
        str = scn.nextLine();

        for(int i=0; i<str.length();++i)
            for
        
    }
    // abcd = a b c d ab bc cd abc bcd abcd


    public static boolean Palindrome(String toCheck, int index){
        if(toCheck.charAt(index) != toCheck.charAt(toCheck.length()-(1+index)))
            return false;
        else if(index >= toCheck.length()>>2)
            return (true);
        return Palindrome(toCheck, index+1);
    }
}