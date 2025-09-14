import java.util.*;
public class StackArraylist {
    static class Stack{
        static ArrayList<Integer> stack=new ArrayList<>();
        public boolean isEmpty(){
           return stack.size()==0;
        }
        public  void push(int data){
            stack.add(data);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int remove=stack.get(stack.remove(stack.size()-1));//store the deleted value
            stack.remove(stack.size()-1);
            return  remove;
        }
        public int peek(){
            return stack.get(stack.size()-1);
        }
       
    }
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(3);
        s1.push(2);
        s1.push(1);
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
       
    }
}
