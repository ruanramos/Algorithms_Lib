package com.ruan;

import java.util.EnumSet;

interface GenericVisitor<T> {
    // Can be used on trees or graphs

    void VisitNode(GenericNode<T> node);
}
