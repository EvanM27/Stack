public class Main 
{
    public static void main(String[] args) 
    {
        //Driver for testing
        int info;
        Stack myStack = new Stack();
        
        info = 10;
        myStack.push(info);
        info = 7;
        myStack.push(info);
        info = 3;
        myStack.push(info);
        info = 4;
        myStack.push(info);
        info = 8;
        myStack.push(info);

        myStack.peek();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.peek();
        myStack.pop();
        
        info = 21;
        myStack.push(info);
        myStack.peek();
    }
    
}
