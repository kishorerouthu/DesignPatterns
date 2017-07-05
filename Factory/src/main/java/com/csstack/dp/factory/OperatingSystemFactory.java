package com.csstack.dp.factory;

import com.csstack.dp.os.Android;
import com.csstack.dp.os.IOS;
import com.csstack.dp.os.OS;
import com.csstack.dp.os.Windows;

/**
 * @author Kishore Routhu on 5/7/17 8:49 PM.
 */
public class OperatingSystemFactory {

    public OS getInstance(String type) {
        if (type.equals("Open"))
            return new Android();

        if (type.equals("Closed"))
            return new IOS();

        return new Windows();
    }
}
