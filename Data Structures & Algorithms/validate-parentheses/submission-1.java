class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == (']') || c == ('}') || c == (')')) {
                 if (stack.isEmpty()) return false;
                 char m = stack.pop();
        
                if(m != '(' && c == ')') return false;
                if(m != '[' && c == ']') return false;
                if(m != '{' && c == '}') return false;
            } 
        }

        if (stack.isEmpty()) return true;

        return false;
    }
}
