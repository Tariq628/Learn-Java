
class handleStack{
    int [] arr = new int[7];
    int top = -1;
    void push(int item){
        if(!isFull()){
            arr[++top] = item;
        }
        else{
            System.out.println("Array is Full");
        }
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return (top == arr.length-1);
    }
    int pop(){
        if(!isEmpty()){
            return arr[top--];
        }
        else{
            System.out.println("Array is empty");
            return -1;
        }
    }
}

public class ArrStack{
    public static void main(String[] args) {
        handleStack hanStack = new handleStack();
        hanStack.pop();
        hanStack.push(2);
        hanStack.push(2);
        hanStack.push(2);
        hanStack.push(2);
        hanStack.push(2);
        hanStack.push(2);
        hanStack.push(2);
        hanStack.pop();
        hanStack.push(2);
        System.out.println(hanStack.pop());
    }
}