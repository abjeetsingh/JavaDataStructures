import java.util.HashMap;

class MajorityElementArray{

    public static void main(String[] args) {
        System.out.println("Hello");
        int a[] = new int[]{5,1,4,4,2,3,2,4};
        findMajorityElement(a);

    }
    public static void findMajorityElement(int a[]){
        HashMap<Integer,Integer> dict = new HashMap<Integer,Integer>();
        int n = a.length;
        for(int ele:a){
            if(dict.containsKey(ele)){
                int value = dict.get(ele) + 1;
                if(value>n/2){
                    System.out.println("The Number \"" + ele + "\" has the Maximum Frequency ");
                    return;
                } else
                    dict.put(ele,value);
            }else
                dict.put(ele,1);
        }
    }
}