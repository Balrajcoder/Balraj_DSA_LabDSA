package org.example;

import java.util.Stack;

public class CheckBalancedString {

    public boolean checkBalancedString(String brackets,int length)
    {
         if (length==0) return false;
         if (length %2 != 0) return false;
        Stack<Character> stack= new Stack<Character>();
        for(int i= 0; i<brackets.length(); i++)
        {
            char charac= brackets.charAt(i);
            if(charac =='('||charac=='{'||charac=='[')
            {
                stack.push(charac);
                continue;
            }
            if(stack.isEmpty())
            {
                return false;
            }
            char c;
            switch(charac)
            {

                case '}':
                    c= stack.pop();
                    if(c =='{')
                    {

                    }
                    else
                    {
                        return false;
                    }
                    break;
                case ']':
                    c= stack.pop();
                    if(c == '[')
                    {

                    }
                    else
                    {
                        return false;
                    }
                    break;
                case ')':
                    c= stack.pop();
                    if(c == '(')
                    {

                    }
                    else
                    {
                        return false;
                    }
                    break;
            }
        }

        return (stack.isEmpty());
    }
}
