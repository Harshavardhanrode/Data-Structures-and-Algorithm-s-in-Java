// stack using arrray

public class Stack{
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    Stack(){
        arr = new int[10];
        capacity =10;
        top =-1;
    }
    public void push(int data){
        if(isoverflow()){
            System.out.println("stack is overflow");
            return;
        }
        top++;
        arr[top] = data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empyty");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isoverflow(){
        return top == capacity-1;
    }
    public void displayStack(){
        int i=0;
        while(i<=top){
            System.out.print(arr[i] + " <-");
            i++;

        }
    }
    
    public static void main(String args[]){
        Stack s1 = new Stack(12);
        s1.push(3);
        s1.push(5);
        s1.push(20);

        s1.displayStack();
        System.out.println();
        s1.pop();
        s1.displayStack();

    }
    
}
