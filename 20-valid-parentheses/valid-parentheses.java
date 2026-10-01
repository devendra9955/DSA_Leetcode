class Solution {
    public boolean isValidPair(char opening , char closing ){
        if(opening == '(' && closing == ')') return true;
        if(opening == '{' && closing == '}') return true;
        if(opening == '[' && closing == ']') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.size() == 0) return false;
                char opening = st.peek();
                if(isValidPair(opening,ch)) st.pop();
                else return false;
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
}