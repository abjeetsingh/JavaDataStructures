import java.util.ArrayList;
import java.util.*;
class KPC{

    static String[] codes = new String[]{ "?@","abc","def","ghi","jkl","mnop","qrst","uv","wxyz", ",:"};
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String Typed = scn.nextLine();
    ArrayList<String> finalAns = getKPC(Typed);
    scn.close();
    for(String kpcs:finalAns)
        System.out.print("\t"+ kpcs);
    }

    public static ArrayList<String> getKPC(String Typed){

        if(Typed.length() == 0){
            ArrayList<String> breakArray = new ArrayList<String>();
            breakArray.add("");
            return breakArray ;
        }

        String adlater = codes[(Typed.charAt(0)-48)];
        ArrayList<String> rrec = getKPC(Typed.substring(1));
        ArrayList<String> Finalrec = new ArrayList<String>();
        int charlen = adlater.length(); 

        for(int i=0; i<charlen; ++i)
            for(String addres:rrec)
                Finalrec.add(adlater.charAt(i)+addres);

        return Finalrec;



    }
}