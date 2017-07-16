package com.csstack.dp.singleton;

import java.io.Serializable;

/**
 * This class is used for testing the, destroy of singleton pattern using Serialization,
 * so it implements the marker interface Serializable.
 *
 * To overcome this issue raised by serialization we have implement readResolve method to return
 * same instance;
 *
 * @author Kishore Routhu on 16/7/17 11:49 AM.
 */
public class SerializedSingleton implements Serializable {

    /* Private constructor to restrict instantiation from other classes */
    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    /* Public static method with provides global access to single instance */
    public static SerializedSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /* Implement readResolve to prevent, destroying singleton */
    protected Object readResolve() {
        return SingletonHelper.INSTANCE;
    }
}
