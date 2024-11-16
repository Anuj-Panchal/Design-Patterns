package com.anuj.behavioural.iterator;

public class IteratorImpl<T> implements Iterator<T>{

    private final T[] collection;

    private int position;

    public IteratorImpl(T[] collection) {
        this.collection = collection;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < collection.length;
    }

    @Override
    public T next() throws IllegalAccessException {
        if(position >= collection.length)
            throw new IllegalAccessException("No Element found");
        return collection[position++];
    }
}
