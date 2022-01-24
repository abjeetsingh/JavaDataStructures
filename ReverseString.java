import java.util.*;
class ReverseString{
    

    public static String reverseingString(String s, int n){
        if(n==-1)
            return "";
        
        return (s.charAt(n) + reverseingString(s, n-1)); 
    }
    public static void main(String[] args){
        String s;
        int n;
        Scanner scn = new Scanner(System.in);

        s = scn.nextLine();
        n = s.length();
        String ans = reverseingString(s, n-1);
        System.out.println(ans);
        scn.close();
    }
}