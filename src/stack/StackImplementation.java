package stack;

public class StackImplementation {

    int arr[];
    int capacity;
    int top;

    public void createStack(int size){
        arr= new int[size];
        capacity=size;
        top=-1;
    }

    public boolean isEmpty(){
       return top==-1;
    }
    public boolean isFull(){
        return top+1==capacity;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Sorry Array Full!");
        }
        top++;
        arr[top]= x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Sorry Array Empty!");
        }
        return arr[top--];

    }
    public void peek(){
        System.out.println(arr[top]);
    }
    public int size(){
        return top+1;
    }


    public static void main(String[] args) {
        StackImplementation obj = new StackImplementation();
        obj.createStack(5);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.peek();
        obj.push(9);
        obj.peek();
        obj.pop();
        obj.peek();
        System.out.println("Size:"+obj.size());
    }
}
