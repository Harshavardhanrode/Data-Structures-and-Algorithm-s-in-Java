import java.util.Stack;
public class StackUsingCollectionF {
    public static void main(String[] args) {
        Stack <Integer>s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(4);

        while( ! s1.empty()){
            System.out.println(s1.peek()+ " ");
            s1.pop();
        }
        System.out.println("null");
    
    }
    
}
