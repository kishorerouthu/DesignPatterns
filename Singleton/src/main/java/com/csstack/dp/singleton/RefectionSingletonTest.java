package com.csstack.dp.singleton;

import java.lang.reflect.Constructor;

/**
 * Using Reflection to destroy singleton pattern
 * This implementation creates 2 instances by using reflection.
 * We can avoid this destroy by using enum singleton.
 *
 * @author Kishore Routhu on 16/7/17 11:21 AM.
 */
public class RefectionSingletonTest {

    public static void main(String[] args) {
        EagerInitialization instanceOne = EagerInitialization.getInstance();
        EagerInitialization instanceTwo = null;
        try {
            Constructor<?>[] declaredConstructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : declaredConstructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Instance-One :: " + instanceOne.hashCode());
        System.out.println("Instance-Two :: " + instanceTwo.hashCode());
    }
}
