package java.util.concurrent;

import java.util.ArrayDeque;
import java.util.Collection;

public class ArrayBlockingQueue<E> extends ArrayDeque<E> implements BlockingQueue<E>, java.io.Serializable {

    public ArrayBlockingQueue(int numElements) {
        super(numElements);
    }
    
    @Override public void put(E e) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override public E take() throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override public int remainingCapacity() {
        throw new UnsupportedOperationException();
    }

    @Override public int drainTo(Collection<? super E> c) {
        throw new UnsupportedOperationException();
    }

    @Override public int drainTo(Collection<? super E> c, int maxElements) {
        throw new UnsupportedOperationException();
    }
}
