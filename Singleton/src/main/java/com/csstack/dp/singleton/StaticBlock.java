package com.csstack.dp.singleton;

/**
 * Static block initialization implementation is similar to eager initialization, except that the
 * instantiation of the class is inside the static block that provide the option for exception handling.
 *
 * @author Kishore Routhu on 16/7/17 9:26 AM.
 */
public class StaticBlock {

    /*Private static variable of tye StaticBlock */
    private static final StaticBlock INSTANCE;

    /*Static block to instantiate the singleton with exception handling*/
    static {
        try {
            INSTANCE = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occures while creating singleton instance");
        }
    }

    /* Private constructor to restrict instantiation from other classes */
    private StaticBlock() {
    }

    /* Public static method with provides global access to single instance */
    public static StaticBlock getInstance() {
        return INSTANCE;
    }
}
