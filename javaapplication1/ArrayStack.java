
package javaapplication1;


public class ArrayStack {
    int size;
    int[] array;
    int top;
    int min;
    public ArrayStack(int s){
        size=s;
        array= new int [size];
        top=-1;
      
    }
    public int getMin () {
        return min;
    }
    public int peek()
        throws StackUnderflowException {
 if (isEmpty()) {
 throw new StackUnderflowException(
 "Стек пуст");
 } else {

        return array[size-1];
    }
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return (top==-1);
    } 
     public boolean isFull () {
        return size==top;
    }
    public void push (int a) throws StackUnderflowException {
        try {
            if (size == 0) {
                array[size] = a;
                min = a;
            } else if (a < min) {
                array[size] = a;
                min = a;
                assert (array[size] < min);
            }
            if (isFull()) {
                throw new StackUnderflowException("Стек полон");
            } else {
                array[size] = a;
            }
            ++size;
        } catch(StackUnderflowException e){
           System.out.println("Стек полон");

        }
    }
    public int pop()  throws StackUnderflowException
    {
    if (isEmpty()){
         throw new StackUnderflowException("Стек пуст");
       
    }
    --size;
    int a =array[size];
    if ( ( size > 0 ) && ( a < min ) ) {
            int pmin = min;
            min += min - a;
            return pmin;
        }

        else {
            return a;
        }
    }
    
}

