package com.csstack.dp.singleton;

/**
 * Lazy initialization implementation creates the instance inside the global access method
 * for the very first time when it invokes.
 * <p>
 * This implementation works fine in-case of single threaded environment but when it comes to multithreaded systems,
 * it can cause issues if two threads are inside the if block at the same time. It will destroy the singleton
 * pattern and both threads will get the different instances of singleton class.
 *
 * @author Kishore Routhu on 16/7/17 9:36 AM.
 */
public class LazyInitialization {

    /*Private static variable of tye LazyInitialization*/
    private static LazyInitialization INSTANCE;

    /* Private constructor to restrict instantiation from other classes */
    private LazyInitialization() {
    }

    /* Public static method with provides global access to single instance */
    public static LazyInitialization getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitialization();
        }
        return INSTANCE;
    }
}
