import java.util.Stack; 
 
class IsBalancedp  
{ 
    public static boolean IsBalance(String expression)  
    { 
        Stack<Character> stack = new Stack<>(); 
 
        for (char ch : expression.toCharArray()) { 
            if (ch == '(' || ch == '{' || ch == '[') { 
                stack.push(ch); 
            } else if (ch == ')' || ch == '}' || ch == ']') { 
                if (stack.isEmpty()) { 
                    return false; 
                } 
                char top = stack.pop(); 
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) { 
                    return false; 
                } 
            } 
        } 
        return stack.isEmpty();
    } 
 
    public static void main(String[] args)  
    { 
        String expression1 = "{(a+b)*(c-d)}"; 
        String expression2 = "{(a+b)*[c-d)}"; 

        System.out.println("Expression: " + expression1 + " is balanced: " + IsBalance(expression1)); 
        System.out.println("Expression: " + expression2 + " is balanced: " + IsBalance(expression2));
    }
} 

