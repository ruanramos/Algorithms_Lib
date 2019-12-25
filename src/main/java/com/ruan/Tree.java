package com.ruan;

public abstract class Tree<T> implements GenericVisitor<T> {
    private GenericNode<T> head;

    public GenericNode<T> getHead() {
        return head;
    }

    public void setHead(GenericNode<T> head) {
        this.head = head;
    }
}
