import java.util.ArrayList;

class NGETR{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(){{
            add(2);add(5);add(9);add(3);add(1);add(12);add(6);add(8);add(7);}};
            for(int i:arr)
                System.out.println(i);
        nge(arr);

    }

    public static void nge(ArrayList<Integer> arr){
        int ngl = -1;
        if(arr.size()<=0)
            return;
        for(int i:arr)
            if(i> arr.get(0)){
                ngl = i;
                break;
            }
        System.out.println(arr.get(0) + " --> " + ngl);
        arr.remove(0);
        nge(arr);
        


    }
}