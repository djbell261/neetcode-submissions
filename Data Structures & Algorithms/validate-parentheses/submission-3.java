class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if (c == '['){
                stack.push(']');
            }
            else if (c == '{'){
                stack.push('}');
            }
            else if (c == '('){
                stack.push(')');
            }
            else{
                if(stack.isEmpty() || stack.pop() != c){
                    return false;
                }
            }

     
        }
        return stack.isEmpty();
    }
}
/*
Stack: LIFO


using a stack we can validate the string
If the string contains '[' then push ']' into the stack
then the next character should be ']' in the string, if you pop the top of the stack it should equal the next character. then by the end the stack should be empty, if not then it snot valid



string, ([{}])
           ^
stack,  }])

if s is "" 
    return false

stack = {}
for every characeter in string
    if character = '['
        push ']' to stack
    else if char = '{'
        push '}' to stack
    else if char = '('
        push ')' to stack

    else    
        if(stack.peek == character)
            stack.pop;

return stack.isEmpty

*/