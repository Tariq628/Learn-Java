

class Stack{
    int [] arr = new int[5];
    int top = -1;
    public void push(int element){
        arr[++top] = element;
    }
    public int pop(){
        return arr[top--];
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return top == arr.length-1;
    }
}

class SakeOfPractice{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        System.out.println(stack.peek());
        stack.push(222);
        stack.push(222);
        stack.push(222);
        stack.push(222);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}