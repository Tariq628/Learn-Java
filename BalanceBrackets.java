
class Stack {
    int size;
    int top;
    char[]a;
    
    boolean isEmpty(){
        return (top<0);
    }
    Stack (int n ){
        top=-1;
        size=n;
        a= new char [size];
    }
    boolean push(char x ){
        if (top>=size){
            System.out.println("Stack Overflow");
            return false;
            
        }
        else {
            a[++top]=x;
            return true;
    }
}
    char pop (){
        if (top<0){
            System.out.println("Stack Under Flow");
            return 0;
            
        }
        else {
            char x=a[top--];
            return x;
        }
}
}
    
class BalancedBrackets {
    static boolean areBracketsBalanced(String expr)
    {
        

        Stack stack= new Stack(10);
 
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
}


public class BalanceBrackets {

 
    public static void main(String[] args) {
         String expr = "[(])";
 
        // Function call
        if (BalancedBrackets.areBracketsBalanced(expr))
        {
            System.out.println("Balanced ");
        }
        else
        {
            System.out.println("Not Balanced ");
    
        }
        expr="[()]{}{[()()]()}" ;
         if (BalancedBrackets.areBracketsBalanced(expr))
        {
            System.out.println("Balanced ");
        }
        else
        {
            System.out.println("Not Balanced ");
    
        }
    
}
}