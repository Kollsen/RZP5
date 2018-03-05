
package javaapplication1;


public class StackedQueue implements JavaApplication1.Queue {
    ArrayStack Stack1;
    ArrayStack Stack2;
    int Size;
    int Min;

   public StackedQueue() {
        Stack1 = new ArrayStack(10);
        Stack2 = new ArrayStack(10);
    }

    public void enqueue(int b)throws StackUnderflowException {
        if(isEmpty()){
            Min=b;
        }
        Stack1.push(b);

        if(Min > b){
            Min=b;
        
        Size+=1;
    }else{
         throw new StackUnderflowException("Очередь заполнена");
    }
    }
    
    public int peek() throws StackUnderflowException {
        try {
        if (Stack2.isEmpty()) {
            while (!Stack1.isEmpty()) {
                Stack2.push(Stack1.pop());
            }
        }
        return Stack2.peek();
    }
        catch (StackUnderflowException e){
             throw new StackUnderflowException("Очередь пуста");
        }
    }
    public int dequeue() throws StackUnderflowException {
         if(isEmpty()) {
            throw new  StackUnderflowException("Очередь пуста");
        }

        int x=-1;
        while(!Stack1.isEmpty()){
            Stack2.push(Stack1.pop());
        }
        if(!Stack2.isEmpty()){
            x=(int)Stack2.pop();
        }
        while(!Stack2.isEmpty()){
            Stack1.push(Stack2.pop());
        }
        return x;

    }


    
    public int getSize() {
        return Stack1.getSize()+Stack2.getSize();
    }

    
    public boolean isEmpty(){
        return Size==0;
    }

    
    public boolean isFull() {
        return Stack1.isFull()&&Stack2.isFull();
    }

    public boolean empty() {
        return Stack1.isEmpty() && Stack2.isEmpty();
    }
    public int min(){
        return Stack1.getMin();
    }
    
    
}
