package com.csstack.dp.singleton;

/**
 * In eager initialization the instance of singleton class created at the time of class loading,
 * this is the easiest method to create a singleton class but it has a drawback that instance is created
 * even though client application might not use it.
 * <p>
 * If the singleton class is not using any resources, this is the approach to use. But the in most of the
 * scenarios, Singleton classes are created for resources such as File System, Database connections etc
 * and we should avoid the instantiation until unless client calls the getInstance method. Also this
 * method doesn't provide option for exception handling.
 *
 * @author Kishore Routhu on 16/7/17 9:15 AM.
 */
public class EagerInitialization {

    /*Private static variable of tye EagerInitialization*/
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    /* Private constructor to restrict instantiation from other classes */
    private EagerInitialization() {
    }

    /* Public static method with provides global access to single instance */
    public static EagerInitialization getInstance() {
        return INSTANCE;
    }
}
