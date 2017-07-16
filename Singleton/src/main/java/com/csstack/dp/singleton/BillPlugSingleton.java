package com.csstack.dp.singleton;

/**
 * Bill Plug method uses the static inner helper class to create singleton instance.
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory and
 * only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.
 *
 * @author Kishore Routhu on 16/7/17 11:10 AM.
 */
public class BillPlugSingleton {

    /* Private constructor to restrict instantiation from other classes */
    private BillPlugSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPlugSingleton INSTANCE = new BillPlugSingleton();
    }

    /* Public static method with provides global access to single instance */
    public static BillPlugSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
