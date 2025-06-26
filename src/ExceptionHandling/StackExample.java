package ExceptionHandling;

class StackOverflow extends Exception{
    public String toString(){
        return "stack is full";
    }
}
class StackUnderflow extends Exception{
    public String toString(){
        return "stack is empty";
    }
}

class Stack{
    int size;
    int top = -1;
    int S[];

    public Stack(int sz){
        size = sz;
        S = new int[sz];
    }

    public void push(int x) throws StackOverflow{
        if(top==size-1)
            throw new StackOverflow();
        top++;
        S[top] = x;
        }

        public int pop() throws StackUnderflow{
            int x=-1;
            if (top==-1)
                throw new StackUnderflow();
            x=S[top];
            top--;
            return x;
        }
    }


public class StackExample {

    public static void main(String[] args) {
        Stack s = new Stack(5);
        try {
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);

            }
        catch (StackOverflow so){
            System.out.println(so);
        }
    }
}
