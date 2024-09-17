import java.util.Stack;

public class ParenthesisCheckerGFG {
    public static boolean ispar(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()!='('){
                    return false;
                }
                else{
                    st.pop();
                }
            }else if(s.charAt(i)==']'){
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()!='['){
                    return false;
                }
                else{
                    st.pop();
                }
            }else if(s.charAt(i)=='}'){
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()!='{'){
                    return false;
                }else{
                    st.pop();
                }
            }else{
               st.push(s.charAt(i));
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s="{([])}";
        System.out.println(ispar(s));
    }
}
