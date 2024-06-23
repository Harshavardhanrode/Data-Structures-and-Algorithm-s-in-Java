

import java.util.ArrayList;

public class StackUsingArrayList {
    public static class stack{
        public static ArrayList<Integer>list = new ArrayList<>();
        
        public static void push(int data){
            list.add(data); 
        }
        public static int pop(){
            if(isEmpty()){
                System.out.print("Arraylist is overflow:");
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;   
        }
        public static int peek(){
            return list.get(list.size()-1);
        }

        public static boolean isEmpty(){
            if(list.size() == 0)
                return true;
            return false;    
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
