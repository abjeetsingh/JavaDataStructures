import java.util.*;
import java.lang.*;
class MakePattern{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String p = scn.nextLine();
        scn.close();
        boolean ans = isPattern(s,p);
        System.out.println(ans);
    }
    static public boolean isPattern(String s, String p){
        int position = 0;
        for(char i=0; i<s.length(); i++){
            if(s.charAt(i)==p.charAt(position) || p.charAt(position) == '.')
                position++;
            else if(p.charAt(position) == '*'){
                if(i+1<s.length() && position+1< p.length() && s.charAt(i+1) == p.charAt(position+1))
                    position++;
            }
            else
                return false;
        }
        if(position == p.length()-1)
            return true;
        else
        return false;
    }
}