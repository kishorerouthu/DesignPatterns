package com.csstack.dp.singleton;

/**
 * Using clone method we can create copy of object. Means it will create new copy of the
 * same object, hence it breaks the singleton.
 * <p>
 * To overcome this we need to implement clone method, and throws CloneNotSupportedException.
 *
 * @author Kishore Routhu on 16/7/17 12:03 PM.
 */
public class CloneSingletonTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneSingleton instanceOne = CloneSingleton.getInstance();
        CloneSingleton instanceTwo = (CloneSingleton) instanceOne.clone();
        System.out.println("Instance-One :: " + instanceOne.hashCode());
        System.out.println("Instance-Two :: " + instanceTwo.hashCode());
    }
}
