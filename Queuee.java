
class Queue1{
    int [] arr;
    int front;
    int rear;
    int check = 0;
    int size;
    public Queue1(int maxsize){
        arr = new int[maxsize];
        size = maxsize;
        front = 0;
        rear = -1;
    }
    void Enqueue(int item){
        arr[++rear] = item;
        check += 1;

    }
    int Dequeue(){
        check -= 1;
        return arr[front++];
    }
    boolean isEmpty(){
        if(check == 0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull(){
        if(check == size){
            return true;
        }
        return false;
    }
    int peek(){
        return arr[front];
    }
}
public class Queuee{
    public static void main(String[] args) {
        Queue1 queue = new Queue1(5);
        queue.Enqueue(7);
        queue.Enqueue(5);
        queue.Enqueue(5);
        queue.Enqueue(9);
        System.out.println(queue.peek());
        System.out.println(queue.isFull());
        queue.Enqueue(5);
        System.out.println(queue.isFull());

        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        System.out.println(queue.isEmpty());
    }
}
