class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='}' && stack.size() > 0 && stack.peek() == '{'){
                stack.pop();   
            } else if(c==')' && stack.size() > 0 && stack.peek() == '('){
                stack.pop();
            } else if(c==']' && stack.size() > 0  && stack.peek() == '[' ){
                stack.pop();
            } else {
                stack.push(c);
            }
            
        }

        if(stack.isEmpty()) return true;

        return false;
       
    }
}
