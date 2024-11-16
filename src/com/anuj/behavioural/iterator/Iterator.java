package com.anuj.behavioural.iterator;

public interface Iterator<T> {

    boolean hasNext();

    T next() throws IllegalAccessException;
}
