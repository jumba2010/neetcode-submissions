class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parenthesisPair= new HashMap<>();
        parenthesisPair.put(')', '(');
        parenthesisPair.put('}', '{');
        parenthesisPair.put(']', '[');
        
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0 ; i < s.length(); i++){
            if(!stack.isEmpty() 
            && parenthesisPair.containsKey(s.charAt(i)) 
            && stack.peek()==parenthesisPair.get(s.charAt(i))){
                stack.pop();
            }
            else{
               stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}
