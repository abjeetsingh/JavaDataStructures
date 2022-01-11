

class Gcd {
    public static void main(String[] args){
        int x = gcd(12,15);
        System.out.print(x);
    }

    public static int gcd(int a, int b){
        if(b==0) return a;

        return gcd(b, (a%b));

    }
}