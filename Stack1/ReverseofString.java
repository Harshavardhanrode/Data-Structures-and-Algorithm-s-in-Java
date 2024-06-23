package Stack1;
import java.util.Scanner;
import java.util.Stack;

public class ReverseofString {
    public static String reverseofstring(String str){
        Stack<Character>sta = new Stack<>();

        int i=0;
        while(i<str.length()){
            sta.push(str.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder("");
        while (!sta.isEmpty()){
            char a = sta.pop();
            sb.append(a);
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
    
        System.out.print("Enter your string :"  );
        String str =x.nextLine();
        System.out.println("reversed string is : " + reverseofstring(str));
        
    
    }
}
