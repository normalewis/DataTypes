package cool.norma;

import java.util.ArrayList;

public class Stack {

    private ArrayList<Object> stack;

    public Stack(){
        stack = new ArrayList<Object>();
    }
    public void push(Object x){
        //index 0 is bottom of the stack
        stack.add(x);
    }
    public void pop(){
        stack.remove(stack.size()-1);
    }
    public int size(){
        return(stack.size());
    }
    public boolean isEmpty(){
        return(stack.isEmpty());
    }
    public Object top(){
        return(stack.get(stack.size()-1));
    }
}
