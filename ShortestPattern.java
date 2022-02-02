import java.util.*;

class ShortestPattern{
    public static void main(String[] args) {
        String str = new String();
        Scanner scn = new Scanner(System.in);
        str = scn.nextLine();
        pattern(str);
        scn.close();
    }

    public static void pattern(String str){
        Stack<Integer> pattern = new Stack<>();
        int num = 1;
        for (int i = 0; i < str.length(); ++i){
            char ch = str.charAt(i);
            if(ch == 'd'){
                pattern.push(num);
                num++;
            } else{
                pattern.push(num);
                num ++;
                
                while(pattern.size() > 0)
                    System.out.print(pattern.pop());
            }
        }
        pattern.push(num);
        while(pattern.size() > 0)
            System.out.print(pattern.pop());
    }
}