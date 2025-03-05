package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR1Stack {
    public final int CAPACITY = 15;
    private Stack<Integer> stack;

    public PR1Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<>(CAPACITY);
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }

    public void push(Integer c) {
        this.stack.push(c);
    }

    public Integer pop() {
        return this.stack.pop();
    }
}
