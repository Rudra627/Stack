import java.util.*;
public class StackBtm {
    public static void AddBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        AddBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        AddBottom(s, 4);
        while(!s.isEmpty()){
            int top=s.pop();
            // System.out.println(s.peek());
            System.out.println(top);
        }
    }
}
