package StackAndQueue.StockSpanner;

import java.util.Stack;

public class StockSpanner {

    Stack<Pair> st = new Stack<>();

    public StockSpanner(){

    }

    public int span(int price){
        // count stores the number of span (which means smaller prev values)
        // add into the pair every time
        // check for stack size and if the price >= stack.peek().first

        int count = 1;

        while(!st.isEmpty() && price >= st.peek().first){
            count += st.peek().second;
            st.pop();
        }
        st.push(new Pair(price,count));

        return count;
    }

}
