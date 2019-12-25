package com.ruan;

import java.util.List;

public class GenericNode<T> {
    private T value;

    public GenericNode(T value) {
        this.value = value;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
