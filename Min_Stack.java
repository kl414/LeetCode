class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> st = new Stack<Integer>();
    
    public void push(int x) {
        //the prev min value is right after the current min value
        //this is useful when popping the current min value
        //the equal sign is needed for case when duplicate mins are present
        if(x <= min){
            st.push(min);
            min = x;
        } 
        st.push(x);
    }

    public void pop() {
        if(min == st.peek()){
            st.pop();
            min = st.peek();
            st.pop();
        }else{
            st.pop();
        }
        //when stack is not pushed yet, or all element is popped
        if(st.empty() || st.peek() == Integer.MAX_VALUE)
            return;
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min;
    }
}
