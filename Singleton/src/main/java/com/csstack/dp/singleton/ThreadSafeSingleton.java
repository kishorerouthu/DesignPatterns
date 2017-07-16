package com.csstack.dp.singleton;

/**
 * @author Kishore Routhu on 16/7/17 9:45 AM.
 */
public class ThreadSafeSingleton {

    /*Private static variable of tye ThreadSafeSingleton */
    private static ThreadSafeSingleton INSTANCE;

    /* Private constructor to restrict instantiation from other classes */
    private ThreadSafeSingleton() {
    }

    /*
     * To create a thread-safe singleton class is to make the global access method <b> synchronized </b>,
     * so that only one thread can execute this method at a time.
     *
     * This implementation works fine and provides thread-safety but it reduces performance because of cost
     * associated with the synchronized method, although we need it only for the first few threads who might
     * create the separate instances. Threads doesn't required lock once the object is created.
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }

    /*
     * To avoid the performance issue associated with synchronized we use double checked locking.
     * In this approach, the synchronized block is used inside the if condition with an additional
     * check to ensure that only one instance of singleton class is created. Here once the object got
     * created by initial threads, other threads never use locking.
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (INSTANCE == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadSafeSingleton();
                }
            }
        }

        return INSTANCE;
    }
}
