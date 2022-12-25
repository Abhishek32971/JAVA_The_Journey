import java.util.*;
class Queue{
    int[] queue;
    int front;
    int rear;
    int size;
    Queue(int size){
        this.size=size;
        queue=new int[size];
        front=rear=-1;
    }
    void enqueue(int ele){
        if(rear==-1){
            queue[++rear]=ele;
            front++;
        }
        else if(rear==size-1){
            System.out.println("overflow");
        }
        else{
            queue[++rear]=ele;
        }
    }
    int dequeue(){
        if(rear==-1){
            System.out.println("underflow");
            return -1;
        }
        else if(rear==front){
            int c=queue[rear];
            rear--;
            front--;
            return c;
        }
        return queue[rear--];
    }
    void displayy(){
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }

}
public class program4 {
    public static void main(String[] args) {
        System.out.println("enter the size of queue");
        Scanner sc=new Scanner (System.in);
        //System.out.println("enter the size of stack");
        int xc=sc.nextInt();
        Queue Q=new Queue(xc);
        boolean flag=true;
        while(flag){
            System.out.println("welcome to queue\n 1.enqueue ele \n 2.dequeue ele 3. display \n 4. exit \n enter your choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1: 
                    System.out.println("enter element to enqueue");
                    Q.enqueue(sc.nextInt());
                    break;
                case 2:
                    System.out.println("dequeued ele : "+ Q.dequeue());
                    break;
                case 3:
                    Q.displayy();
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("invalid choice!!");
            }
        }

    }
}
