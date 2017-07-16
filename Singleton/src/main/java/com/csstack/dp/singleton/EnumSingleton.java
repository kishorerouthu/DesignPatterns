package com.csstack.dp.singleton;

/**
 * To overcome the issue raised by reflection, enums are used because java ensures
 * internally that enum value is instantiated only once. Since java Enums are globally
 * accessible, they can be used for singletons. Its only drawback is that it is not
 * flexible i.e it does not allow lazy initialization.
 *
 * As enums don't have any constructor so it is not possible for Reflection to utilize it.
 * Enums have their by-default constructor, we can't invoke then by our-self. JVM handles the
 * creation and invocation of enum constructors internally. As enums don't give their constructor
 * definition to the program, it is not possible for us to access them by Reflection also.
 *
 * @author Kishore Routhu on 16/7/17 11:32 AM.
 */
public enum  EnumSingleton {

    INSTANCE;
}
