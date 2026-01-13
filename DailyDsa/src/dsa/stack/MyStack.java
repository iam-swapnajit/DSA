package dsa.stack;

public class MyStack {
    private final int capacity;
    private int top;
    private final int[] elements;
    public MyStack(int capacity){
        top = -1;
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public void push(int x){
        if(top == capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        elements[++top] = x;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return  -1;
        }
        return elements[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return elements[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

}
