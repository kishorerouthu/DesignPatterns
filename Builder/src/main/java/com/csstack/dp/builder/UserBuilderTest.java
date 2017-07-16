package com.csstack.dp.builder;

/**
 * @author Kishore Routhu on 16/7/17 1:36 PM.
 */
public class UserBuilderTest {

    public static void main(String[] args) {
        User.UserBuilder builder = new User.UserBuilder("Kishore", "Routhu");
        builder.age(28);
        builder.phone("9493887494");
        builder.address("Hyderabad, TS");

        User user = builder.build();
        System.out.println(user);
    }
}
