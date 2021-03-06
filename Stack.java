class MakeStack{
    public static class Stack{
        int top;
        int[] arr;

        public Stack(int capacity){
            arr = new int[capacity];
            top = -1;
        }

        void push(int a){
            if(top>=arr.length){
                int[] temp = new int[arr.length*2];
                for(int i=0; i<top;++i){
                    temp[i] = arr[i];
                }
                arr = temp;
            } 
            top++;
            arr[top] = a;
        }
    
        int pop(){
            if(arr.length == 0){
                System.out.println("underflow error, noelement can be deleted");
                return -1;
            }
            int temp = arr[top];
            arr[top] = 0;
            top--;
            return(temp);
        }
    
        public void display(){
            for(int i=0;i<=top;++i){
                System.out.println(arr[i]);
            }
        }
    
        public  int size(){
            return top +1;
        }

        public int peak(){
            return top;
        }

        public static void main(String[] args) {
            
        }
    
    }

    public static void main(String[] args) {
        Stack stk = new Stack(2);
        stk.push(1);
        stk.size();
        stk.push(2);
        stk.size();
        stk.push(3);
        stk.size();

    }

}