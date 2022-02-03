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
        }
    
        public  int size(){
            return top +1;
        }
    
    }


}