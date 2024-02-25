import java.util.Stack;
public class Basics {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.pop();
        st.pop();

        System.out.println(st);
    }
}
