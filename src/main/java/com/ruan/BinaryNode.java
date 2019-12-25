package com.ruan;

public class BinaryNode<T extends GenericNode<T>> extends GenericNode<T>{
    private GenericNode<T> leftSon;
    private GenericNode<T> rightSon;

    public GenericNode<T> getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(GenericNode<T> leftSon) {
        this.leftSon = leftSon;
    }

    public GenericNode<T> getRightSon() {
        return rightSon;
    }

    public void setRightSon(GenericNode<T> rightSon) {
        this.rightSon = rightSon;
    }
}
