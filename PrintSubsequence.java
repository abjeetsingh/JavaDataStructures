import java.util.Scanner;

class PrintSubsequence{
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        String str= scn.nextLine();
        printSequence(str, "");

    }

    public static void printSequence(String str, String toAdd){
        if (str.length() == 0)
        {
            System.out.println(toAdd);
            return;
        }

        printSequence(str.substring(1), toAdd + "");
        printSequence(str.substring(1), toAdd + str.charAt(0));
    }
}