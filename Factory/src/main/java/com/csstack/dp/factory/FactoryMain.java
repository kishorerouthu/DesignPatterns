package com.csstack.dp.factory;

import com.csstack.dp.os.OS;

/**
 * @author Kishore Routhu on 5/7/17 8:43 PM.
 */
public class FactoryMain {

    public static void main(String[] args) {
        OperatingSystemFactory factory = new OperatingSystemFactory();
        OS os = factory.getInstance("Closed");
        os.spec();
    }
}
