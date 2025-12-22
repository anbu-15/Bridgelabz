package MultiThreading;

public class Stack {

    private int[] array;
    private int topStack;
    Object lock;

    public Stack(int capacity) {
        array = new int[capacity];
        topStack = -1;
        lock = new Object();
    }

    public boolean push(int element) {
        synchronized (lock) {
            if (isFull()) return false;
            ++topStack;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            array[topStack] = element;
            return true;
        }
    }


//    public synchronized boolean push(int element) {
//synchronized(this) the method level use this key word for Object lock
// static method use ClassName.class for lock
//            if (isFull()) return false;
//            ++topStack;
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
//            array[topStack] = element;
//            return true;
//    }

    private boolean isFull() {
        return topStack >= array.length - 1;
    }

    public int pop() {
        synchronized (lock) {
            if (isEmpty()) return Integer.MIN_VALUE;
            int obj = array[topStack];
            array[topStack] = Integer.MIN_VALUE;

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            topStack--;
            return obj;
        }
    }

    public boolean isEmpty() {
        return topStack < 0;
    }
}
