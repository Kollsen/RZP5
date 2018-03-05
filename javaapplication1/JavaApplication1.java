
package javaapplication1;


public class JavaApplication1 {

    
    public static void main(String[] args)throws StackUnderflowException {
       

        StackedQueue q = new StackedQueue();
        
     
       
        ArrayStack st=new ArrayStack(10);
        st.push(1);
        st.peek();
        
        
        
        
     
    }

    
    public interface Queue {
        void enqueue(int a)throws StackUnderflowException;
        int peek()throws StackUnderflowException;
        int dequeue()throws StackUnderflowException;;
        int getSize();
        boolean isEmpty();
        boolean isFull();
}
 public interface Stack {
        void push(int b)throws StackUnderflowException;;
        int peek()throws StackUnderflowException;;
        int pop()throws StackUnderflowException;;
        int getSize();
        boolean isEmpty();
        boolean isFull()throws StackUnderflowException;
    }
} 