package com.csstack.dp.singleton;

/**
 * This class is used to testing the break singleton using the clone method.
 *
 * @author Kishore Routhu on 16/7/17 12:01 PM.
 */
public class CloneSingleton implements Cloneable {

    /*Private static variable of tye CloneSingleton */
    private static final CloneSingleton INSTANCE = new CloneSingleton();

    /* Private constructor to restrict instantiation from other classes */
    private CloneSingleton() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Throw CloneNotSupportedException to prevent creating new instance by using clone
        throw new CloneNotSupportedException();
    }

    /* Public static method with provides global access to single instance */
    public static CloneSingleton getInstance() {
        return INSTANCE;
    }
}
