package com.ruan;

import java.util.List;

public class TreeIterator<T> implements GenericVisitor<T>{
    enum Strategies {
        PREORDER, INORDER, POSORDER;
    }

    Tree<T> tree;
    Strategies strategy;

    public TreeIterator(Tree<T> tree, Strategies s) {
        this.tree = tree;
        this.strategy = s;
    }

    private void Iterate() {
        switch (strategy) {
            case INORDER:
                InorderIteration();
                break;
            case POSORDER:
                PosorderIteration();
                break;
            case PREORDER:
                PreorderIteration();
                break;
        }
    }

    @Override
    public void VisitNode(GenericNode<T> node) {

    }

    private List<GenericNode<T>> PreorderIteration(GenericNode<T> node) {
        if (node != null) {
            PreorderIteration()
        }
    }
    private void PosorderIteration() {

    }
    private void InorderIteration() {

    }
}
