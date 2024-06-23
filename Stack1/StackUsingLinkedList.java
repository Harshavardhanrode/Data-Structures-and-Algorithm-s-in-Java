
public class StackUsingLinkedList {
    public static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static class stack{
        public static node head = null;

        public static void push(int data){
            node newnode = new node(data);
            if(isEmpty()){
                head=newnode;
                return;
            }
            newnode.next = head;
            head = newnode;    
        }
        public static int pop(){
            if(isEmpty()){
                System.out.print("stack is empty:");
                return -1;
            }
            int top = head.data;
            head =head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.print("stack is empty:");
                return -1;
            }
            return head.data;
        }
        public static boolean isEmpty(){
            return (head==null);
        }
    }
    public static void main(String[] args) {

        stack s1 = new stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(78);
        
            while( ! s1.isEmpty()){
                System.out.println(s1.peek()+ " ");
                s1.pop();
            }
            System.out.println("null");
        
    }
    
}
