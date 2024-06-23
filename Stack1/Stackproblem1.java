
import java.util.Stack;

// push element to bottom of filled stack 

public class Stackproblem1 {

    public static void placeTobottom(Stack<Integer>s,int data){

        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        placeTobottom(s, data);
        s.push(top);

    }
    public static void reverseofstack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseofstack(s);
        placeTobottom(s, top);
    }
    public static void print(Stack<Integer>s1){
        while( ! s1.empty()){
            System.out.println(s1.peek()+ " ");
            s1.pop();
        }
        System.out.println("null");
    }
    
    public static void main(String[] args){
        Stack <Integer>s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(4);


        // 4 2 1
        
        reverseofstack(s1);
        
        //1 2 4
        print(s1);
        
        


    }
}
